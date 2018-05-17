package com.higgsup.Handing_Exception_Multil_Thread.Not_Bat_Duoc;

public class MainTest22 {
    public static void main(String[] args) {
        try {
            Thread thread = new Student2();
            thread.start();
        } catch (Exception e) {
            System.out.println("bắt lỗi");
        }
    }

}

class Student2 extends Thread {
    private int idStudent;

    public int getIdStudent() {
        return idStudent;
    }

    public int throwException() {
        System.out.println("throw exception");
        throw new ArithmeticException();
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public void run() {
        throwException();
    }
}
