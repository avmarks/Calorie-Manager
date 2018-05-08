package edu.matc.nutritionixapi;


import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.hut.ResponseItem;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;

/**
 * This class connects to the API service to retrieve the desired food data
 * like food calories for specific instance
 *  please see https://trackapi.nutritionix.com/docs/#!/default/post_v2_natural_nutrients
 */
public class APIService  {


public FoodsItem getFoodValues(String queryParameter) throws Exception {


    Client client = ClientBuilder.newClient();
    String postBody = "{ \"query\": \"" + queryParameter + "\"}";

    Response jsonStr = client
            .target("https://trackapi.nutritionix.com/v2/natural/nutrients")
            .request(MediaType.APPLICATION_JSON)
            .header("Content-Type", "application/json")
            .header("x-app-id", "19796a1c")
            .header("x-app-key", "0b96c2b8f2ca3c41d23887846c00932f")
            .header("x-remote-user-id", "0")
            .post(Entity.entity(postBody, MediaType.APPLICATION_JSON_TYPE));

    ObjectMapper mapper = new ObjectMapper();
    Foods response1 = mapper.readValue(jsonStr.readEntity(String.class), Foods.class);
    FoodsItem foodsItem = response1.getFoods().get(0);



    return foodsItem;

    }

/*
public ResponseItem getCalorieValues() throws Exception{

    Client client = ClientBuilder.newClient();

    WebTarget target = client.target("https://hutwebapi.azurewebsites.net/api/CalorieCount/GetTotalsPerDayInDateRange?personId=1&startDate=4%2F6%2F2018&endDate=5%2F6%2F2018");
    String response = target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
    ObjectMapper mapper = new ObjectMapper();
    edu.matc.hut.Response response2 = mapper.readValue(response, edu.matc.hut.Response.class);
    ResponseItem responseItem = response2.getResponse().get(0);

    return  responseItem;
}*/



}
