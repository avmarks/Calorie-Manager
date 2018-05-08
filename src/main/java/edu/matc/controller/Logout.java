package edu.matc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * This servlet handles the logout functionality
 */
@WebServlet (
        urlPatterns =  {"/logout"}
)

public class Logout extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        String currentUser = (String)session.getAttribute("currentUser");

        session.removeAttribute(currentUser);
        session.invalidate();
        request.logout();

        RequestDispatcher  dispatcher =
                getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}
