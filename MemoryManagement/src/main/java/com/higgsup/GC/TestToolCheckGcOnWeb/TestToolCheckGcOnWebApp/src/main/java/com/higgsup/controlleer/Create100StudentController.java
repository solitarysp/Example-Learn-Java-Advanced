package com.higgsup.controlleer;/*
  By Chi Can Em  03-04-2018
 */

import com.higgsup.config.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Create100StudentController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (int i = 0; i < 900000; i++) {
            Student student = new Student();
            student.setId(i);

           /* try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

        }
        //Runtime.getRuntime().gc();
        System.out.println("done " + new Date().toString());

    }
}
