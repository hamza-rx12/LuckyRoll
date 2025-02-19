package com.luckyroll.luckyroll;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "signUpServlet", value = "/sign-up")
public class SignUpServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/signUp.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/plain");
        out.println("email: " + request.getParameter("email"));
        out.println("username: " + request.getParameter("username"));
        out.println("password: " + request.getParameter("password"));
        out.println("passconf: " + request.getParameter("passconf"));

    }

}