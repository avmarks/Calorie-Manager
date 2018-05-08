package edu.matc.controller;



import edu.matc.nutritionixapi.APIService;
import edu.matc.nutritionixapi.FoodsItem;

import edu.matc.nutritionixapi.Photo;
import org.apache.logging.log4j.LogManager;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "searchRecipeAPI",
        urlPatterns = {"/searchRecipeAPI"}
)
/**
 * This servlet is responsible for consuming nutritionix API
 */
public class FoodService extends HttpServlet{
    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        APIService apiService = new APIService();
        FoodsItem foodsItem;

        String foodName;
        int foodCalories;
        int foodServing;

        String searchMessage = req.getParameter("searchMessage");

        try {
            foodsItem= apiService.getFoodValues(searchMessage);
            foodName =  foodsItem.getFoodName();
            foodCalories =  foodsItem.getNfCalories();
            String photo = foodsItem.getPhoto().getThumb();
            foodServing =  foodsItem.getServingQty();

            req.setAttribute("foodName", foodName);
            req.setAttribute("foodCalories", foodCalories);
            req.setAttribute("foodPhoto", photo);
            req.setAttribute("foodServing", foodServing);


        } catch (Exception e) {
            logger.error("There was an error retrieving data from API with parameter " + searchMessage);
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("/add_recipe.jsp");
        dispatcher.forward(req, resp);
    }
}


