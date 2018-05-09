package com.higgsup.CheckedvsUnchecked;

import java.io.File;
import java.io.IOException;

public class Checked {
    public static void main(String[] args) {
        // nếu k cho vào try thì sẽ k compile đc

        try {
            File file=new File("d://index");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {

        }finally{

        }

        try {

        }catch (Exception e){

        }
        finally{

        }
    }
}
