package com.higgsup.CustomExceptions;

public class main {
    public static void main(String[] args) {
        try {
            method1();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    private static void method1() throws CustomException {
        if (1 > 0) {
            throw new CustomException("tets custom");
        }
    }
}
