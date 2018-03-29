package com.higgsup.GC.testConnection;/*
  By Chi Can Em  27-03-2018
 */

import com.higgsup.config.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        test();
        System.gc();
        System.out.println("d");
    }

    public static void test() {
        Connection connection = ConnectDB.connectionDB();
        try {
            // PreparedStatement preparedStatement = connection.prepareStatement("SELECT *FROM student");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT *FROM ss");
            preparedStatement.executeQuery();

            //nếu không đóng thì vẫn sẽ có kết nối đến db, và khi trương trình thoát mới thoát kết nối đc.
            connection.close();
        } catch (SQLException e) {

        }

    }
}
