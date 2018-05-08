package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * This servlet is responsible for displaying the admin page
 */
@WebServlet(
        name = "administrator",
        urlPatterns = {"/administrator"}
)
public class AdminDisplay extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDAO genericDAO = new GenericDAO(User.class);

        String data = req.getRemoteUser();


            req.setAttribute("users", genericDAO.getAll());

            RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
            dispatcher.forward(req, resp);


    }
}
