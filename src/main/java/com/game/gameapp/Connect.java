package com.game.gameapp;

import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/Connect")
public class Connect extends HttpServlet {


    public void init() {

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        ServletContext context = getServletContext();
        ArrayList<User> users = (ArrayList<User>) context.getAttribute("users");
        if(users != null) {
            for (User user : users) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
                    response.sendRedirect("login-success.jsp");

                } else {
                    response.sendRedirect("login-error.jsp");
                }
            }
        }else{
            response.sendRedirect("login-error.jsp");
        }

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + username + "</h1>");
        out.println("<h1>" + password + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}