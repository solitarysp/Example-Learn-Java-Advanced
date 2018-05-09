package com.higgsup.CheckedvsUnchecked;

public class Unchecked {
    public static void main(String[] args) {
        // vẫn compile đc, nhưng chạy lỗi
        int a = 0;
        int b = 10;
        int c = 10 / 0;
    }
}
