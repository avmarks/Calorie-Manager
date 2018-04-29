package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/admin"}
)
public class AdminDisplay extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDAO genericDAO = new GenericDAO(User.class);
        req.setAttribute("users", genericDAO.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/admin.jsp");
        dispatcher.forward(req, resp);
    }
}
