package com.example.webproject;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "deleteCookiesServlet", value = "/delete-cookies")
public class DeleteCookiesServlet {
    public void init() {
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie("user_id","");

        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    public void destroy() {
    }
}