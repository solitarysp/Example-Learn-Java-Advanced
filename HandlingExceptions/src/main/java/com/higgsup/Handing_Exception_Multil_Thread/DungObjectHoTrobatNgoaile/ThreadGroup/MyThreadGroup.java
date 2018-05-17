package com.higgsup.Handing_Exception_Multil_Thread.DungObjectHoTrobatNgoaile.ThreadGroup;

public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    public MyThreadGroup(ThreadGroup parent, String name) {
        super(parent, name);
    }

    public void uncaughtException(Thread t, Throwable ex) {
        System.out.println("error");
    }
}
