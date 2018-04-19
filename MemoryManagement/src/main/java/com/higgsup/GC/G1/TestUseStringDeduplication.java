package com.higgsup.GC.G1;


import java.util.ArrayList;

public class TestUseStringDeduplication {
    public static void main(String[] args) {
        ArrayList<java.lang.String> arrayList= new ArrayList<java.lang.String>();
        for (int i = 0; i < 100000; i++) {
            String value=new String("thanh");
            arrayList.add(value);

            System.out.println( System.identityHashCode(value));;
        }
    }
}
