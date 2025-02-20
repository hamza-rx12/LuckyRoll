package com.luckyroll.luckyroll;

import com.luckyroll.luckyroll.Model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "signUpServlet", value = "/sign-up")
public class SignUpServlet extends HttpServlet {
    @Override
    public void init(){

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/signUp.jsp");
        dispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<User> users = (List<User>) getServletContext().getAttribute("users");


        User newUser = new User(request.getParameter("username"),
                                request.getParameter("password"),
                                request.getParameter("email"));
        users.add(newUser);

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("user added successfully!");
        out.println("You will be redirected to sign in with your new account!");
        out.println("<html><body>");
        out.println("<h3>You will be redirected to sign in with your new account!</h3>");

        // Add JavaScript to delay the redirection
        out.println("<script>");
        out.println("setTimeout(function() {");
        out.println("    window.location.href = 'sign-in';");
        out.println("}, 7000);");  // 3000 milliseconds = 3 seconds
        out.println("</script>");

        out.println("</body></html>");
//        out.println(newUser);
//        out.println(getServletContext().getAttribute("users"));

    }

}