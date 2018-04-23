package edu.matc.controller;

import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;

import java.util.List;

public class FoodService {

    private static final String API_KEY = "8a87e348bbe94bf082372f3ae043a8cf";
    private static final String API_REST_SECRET = "dadc59ef9bd54f049ccfe23f7f1e8dce";

    private FatsecretService fatsecretService;


    public FoodService() {
        fatsecretService= new FatsecretService(API_KEY, API_REST_SECRET);
    }

    public String getCalories(String foodName) {

        String query = foodName;
        Response<CompactFood> foodResponse = fatsecretService.searchFoods(query);
        List<CompactFood> compactFoodList = foodResponse.getResults();
        String name = compactFoodList.get(0).getName();
        String calorie = compactFoodList.get(0).getDescription();
                //TODO get specific calorie value, write a method in a form of restful controller
                return calorie;
    }

}


