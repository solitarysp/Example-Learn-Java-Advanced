package com.higgsup.Annotation.UngDUngThucTe;

import com.higgsup.Annotation.UngDUngThucTe.entity.Clazz;

public class main {
    public static void main(String[] args) {
        SaveObject saveObject = new SaveObject();
        Clazz clazz = new Clazz();
        clazz.setId(1);
        clazz.setName("thanh");
        saveObject.Save(clazz);
    }
}
