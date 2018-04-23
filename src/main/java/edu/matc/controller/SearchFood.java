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
import java.util.List;
import java.util.Set;

/**
 * A simple servlet search for a food item of choice
 */
@WebServlet(
        urlPatterns = {"/searchFood"}
)
public class SearchFood extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDAO userDao = new GenericDAO(User.class);

        List<User> listOfUsers = userDao.getByPropertyEqual("userName", req.getRemoteUser());

        User user = (User) listOfUsers.get(0);

        Set<Food> list = user.getFoodSet();

        if (req.getParameter("submit").equals("search")) {

            for (Food food: list) {
                if(food.foodName.contains(req.getParameter("searchTerm"))) {

                    req.setAttribute("foodName", food.getFoodName());
                    req.setAttribute("foodCalorie", food.getFoodCalories());
                }
            }
        } else if (req.getParameter("submit").equals("searchAll")) {
                    req.setAttribute("foods", user.getFoodSet());
        } else {

        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/foodSearchResults.jsp");
        dispatcher.forward(req, resp);
    }
}
