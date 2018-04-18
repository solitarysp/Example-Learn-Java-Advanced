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
 /*  static ArrayList<Student> students;

    @Override
    public void init() throws ServletException {
        students= new ArrayList<Student>();
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (int i = 0; i < 9000000; i++) {
            Student student = new Student();
            student.setId(i);
            //students.add(student);
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
