package com.luckyroll.luckyroll;

import com.luckyroll.luckyroll.Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(name = "gameServlet", value = "/game")
public class GameServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");
        if (user.getScore() == 0) {
            user.setScore(0);
            request.getRequestDispatcher("/WEB-INF/game.jsp").forward(request,response);
        }else{

        }
//        Integer current = 0;
//        Integer previous = 0;
//        curren
//        request.getRequestDispatcher("/WEB-INF/game.jsp").forward(request,response);
//        HttpSession session = request.getSession();
//        session.setAttribute("clicked",false);
//        session.setAttribute("current", );
//        Random random = new Random();
//        int rand  = random.nextInt(6) + 1;
//        if
    }
}