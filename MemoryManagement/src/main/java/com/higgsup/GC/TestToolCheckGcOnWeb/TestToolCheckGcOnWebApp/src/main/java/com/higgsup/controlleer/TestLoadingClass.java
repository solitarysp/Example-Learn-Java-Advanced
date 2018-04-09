package com.higgsup.controlleer;/*
  By Chi Can Em  05-04-2018
 */

import com.higgsup.config.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestLoadingClass",

        urlPatterns = {"/TestLoadingClass"})
public class TestLoadingClass extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Student.TEST_ROOT);

    }
}
