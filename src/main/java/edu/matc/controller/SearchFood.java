package edu.matc.controller;

import edu.matc.entity.Food;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;
import javafx.util.Builder;
import org.hibernate.sql.QuerySelect;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;


/**
 * A simple servlet to welcome the user.
 */

@WebServlet(
        urlPatterns = {"/searchFood"}
)

public class SearchFood extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       // GenericDAO foodDao = new GenericDAO(Food.class);

        GenericDAO userDao = new GenericDAO(User.class);

        //Get particular user
        List<User> listOfUsers = userDao.getByPropertyEqual("userName", req.getRemoteUser());

        //get the id
        User user = listOfUsers.get(0);


        //instantiate the food class
        //Food food = new Food();

        //pass the id into food so that the foodSet (in User knows who is the user)
        //User thisUser = (User)user.getById(userID);

        //food.setUser(thisUser);



        //hmmm gotta get a particular session user here ..

        if (req.getParameter("submit").equals("search")) {
            //nope...
            req.setAttribute("foods", user.getFoodSet().contains(req.getParameter("searchTerm")));

        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("/foodSearchResults.jsp");
        dispatcher.forward(req, resp);
    }
}
