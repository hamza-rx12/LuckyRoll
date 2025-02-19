package com.game.gameapp;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/NewAccount")
public class NewAccount extends HttpServlet {

    public void init() {
        ServletContext context = getServletContext();
        context.setAttribute("users", new ArrayList<User>());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        ServletContext context = getServletContext();
        ArrayList<User> users = (ArrayList<User>) context.getAttribute("users");
        users.add(new User(
                request.getParameter("username"),
                request.getParameter("password")));

        PrintWriter out = response.getWriter();
        out.println("<html><body><ul>");
        out.println("<h1>Users:<h1>");
        if(!users.isEmpty()) {
            for (User user : users) {
                out.println("<h1>" + user+"<h1>");
            }
        }
        // Hello
        out.println("</ul></body></html>");
    }

    public void destroy() {
    }
}