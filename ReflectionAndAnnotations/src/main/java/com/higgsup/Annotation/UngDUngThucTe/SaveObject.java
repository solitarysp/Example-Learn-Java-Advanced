package com.higgsup.Annotation.UngDUngThucTe;

import com.higgsup.Annotation.UngDUngThucTe.annotation.Colum;
import com.higgsup.Annotation.UngDUngThucTe.annotation.Table;
import com.higgsup.Annotation.UngDUngThucTe.entity.Student;
import com.higgsup.config.ConnectDB;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Hashtable;
import java.util.Map;

public class SaveObject {
    private Object o;
    private String name;
    private Class<?> aClass;
    private Hashtable<String, Object> hashtable = new Hashtable();
    private String query = "INSERT  INTO  %s (%s) VALUES (%s)";

    public void Save(Object o) {
        this.o = o;
        aClass = o.getClass();
        getNameTable();
        getColum();
        createQuery();
        try {
            PreparedStatement preparedStatement = ConnectDB.connectionDB().prepareStatement(query);
            Integer index = 1;
            for (Map.Entry a : hashtable.entrySet()
                    ) {
                preparedStatement.setObject(index++, a.getValue());
            }
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createQuery() {

        StringBuilder SBcolum = new StringBuilder("");
        StringBuilder SBvalue = new StringBuilder("");
        for (Map.Entry a : hashtable.entrySet()
                ) {
            SBcolum.append(a.getKey() + ",");
            SBvalue.append("?,");
        }

        String colum = SBcolum.substring(0, SBcolum.length() - 1);
        String value = SBvalue.substring(0, SBvalue.length() - 1);
        query = String.format(query, name, colum, value);
    }

    private void getNameTable() {
        Annotation a = aClass.getAnnotation(Table.class);
        Table table1 = (Table) a;
        this.name = table1.name();
    }


    public void getColum() {
        for (Field field : aClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(Colum.class)) {
                Annotation annotation = field.getAnnotation(Colum.class);
                Colum colum = (Colum) annotation;
                try {
                    field.setAccessible(true);
                    hashtable.put(colum.name(), field.get(o));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
