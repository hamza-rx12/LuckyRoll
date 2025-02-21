package com.luckyroll.luckyroll;

import com.luckyroll.luckyroll.Model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "signInServlet", value = "/sign-in")
public class SignInServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/signIn.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        List<User> userList = (List<User>) getServletContext().getAttribute("users");

        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                request.getSession().setAttribute("user", user);
                request.getRequestDispatcher("menu").forward(request,response);
            }
        }

        request.setAttribute("user_not_found","username or password incorrect");
        doGet(request, response);

    }

}