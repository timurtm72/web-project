package com.example.webproject;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


    @WebServlet(name = "libraryServlet", value = "/library")
    public class LibraryServlet  extends HttpServlet {

        public void init() {

        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            PrintWriter pw = response.getWriter();
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                Connection connection = DriverManager.getConnection(
                        "jdbc:postgresql://localhost:5432/my_db",
                        "postgres",
                        "timur_2022"
                );
                Statement statment = connection.createStatement();
                ResultSet resultSet = statment.executeQuery("select * from books");
                while (resultSet.next()){
                    pw.println(resultSet.getString("title")+ " " + resultSet.getString("author")
                    + " " + resultSet.getString("quantity"));
                }
                statment.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

        public void destroy() {
        }
}
