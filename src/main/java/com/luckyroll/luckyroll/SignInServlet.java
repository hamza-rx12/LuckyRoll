package com.luckyroll.luckyroll;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "signInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/signIn.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
//        request.getParameter("username");
//        request.getParameter("password");
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        out.println("username: " + request.getParameter("username"));
        out.println("password: " + request.getParameter("password"));

    }

}