package edu.matc.controller;

import edu.matc.entity.Food;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 */

@WebServlet(
        urlPatterns = {"/searchFood"}
)

public class SearchFood extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDAO foodDao = new GenericDAO(Food.class);


        req.setAttribute("foods", foodDao.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/foodSearchResults.jsp");
        dispatcher.forward(req, resp);
    }
}
