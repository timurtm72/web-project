package com.example.webproject;

import java.io.*;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.Cart;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        //String name = request.getParameter("name");
        //String lastName = request.getParameter("lastName");
        // Hello
        //HttpSession session = request.getSession();
//        Integer count = (Integer) session.getAttribute("count");
//        if(count == null){
//            count = 1;
//            session.setAttribute("count",count);
//        }else{
//            session.setAttribute("count",count + 1);
//        }
//        Cart cart = (Cart)session.getAttribute("cart");
//        String name = request.getParameter("name");
//        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
//        if(cart == null) {
//            cart = new Cart();
//        }
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        session.setAttribute("cart",cart);
//        try {
//            getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
//        } catch (ServletException e) {
//            System.out.println(e.getMessage());
//        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + "Hello " + message + "</h1>");
       //out.println("<h1>" + "Counter " + count + "</h1>");
        //out.println("<h1>" + "Hello " + name + " " + lastName + "</h1>");
        out.println("<h1>" + new Date() + "</h1>");
        out.println("</body></html>");
        //response.sendRedirect("https://www.google.ru/");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/first.jsp");
//        try {
//            dispatcher.forward(request,response);
//        } catch (ServletException e) {
//            throw new RuntimeException(e);
//        }




    }

    public void destroy() {
    }
}