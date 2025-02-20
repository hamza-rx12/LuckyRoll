package com.luckyroll.luckyroll;

import com.luckyroll.luckyroll.Model.User;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

import java.util.*;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Initialize an empty list of users
        List<User> users = new ArrayList<>();

        // Get the ServletContext
        ServletContext context = sce.getServletContext();

        // Store the user list in the ServletContext
        context.setAttribute("users", users);

        System.out.println("User list initialized in ServletContext.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Cleanup if necessary (optional)
        System.out.println("Application shutting down.");
    }
}