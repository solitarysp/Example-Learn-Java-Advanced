package com.higgsup.GC.testCacTruongHopGC;/*
  By Chi Can Em  27-03-2018
 */

public class Student {
    private int id;
    ;

    public int getId() {
        return id;
    }

    public Student(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Hasscode  "+this.hashCode()+" Id = "+getId() +" Được thu gom rác ");
    }
}
