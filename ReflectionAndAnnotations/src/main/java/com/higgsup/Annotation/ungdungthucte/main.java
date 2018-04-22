package com.higgsup.Annotation.ungdungthucte;

import com.higgsup.Annotation.ungdungthucte.entity.Clazz;
import com.higgsup.Annotation.ungdungthucte.entity.Student;

public class main {
    public static void main(String[] args) {
        SaveObject saveObject = new SaveObject();

        Clazz clazz = new Clazz();
        clazz.setId(1);
        clazz.setName("thanh");

        Student student = new Student();
        student.setId(1);
        student.setAge(1);
        student.setName("thanh");

        saveObject.Save(student);
    }
}
