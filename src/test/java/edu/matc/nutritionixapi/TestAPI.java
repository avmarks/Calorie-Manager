package edu.matc.nutritionixapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.matc.hut.ResponseItem;
import edu.matc.nutritionixapi.Foods;
import edu.matc.nutritionixapi.FoodsItem;
import org.junit.jupiter.api.Test;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;


/*
 * This class test the API call  from nutritionix.
 * please see https://trackapi.nutritionix.com/docs/#!/default/post_v2_natural_nutrients
 *  which is swagger page to test and see more methods

*/
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAPI {
    @Test
    public void testAzureApiJSON() throws Exception {

        Client client = ClientBuilder.newClient();

        String postBody = "{ \"query\": \" apple 100 grams\"}";

        Response jsonStr = client
                .target("https://trackapi.nutritionix.com/v2/natural/nutrients")
                .request(MediaType.APPLICATION_JSON)
                .header("Content-Type", "application/json")
                .header("x-app-id", "f00f8b0d" )
                .header("x-app-key", "92d014ef8c9f1847c456adf89b4b9f7c")
                .header("x-remote-user-id", "0")
                .post(Entity.entity(postBody, MediaType.APPLICATION_JSON_TYPE));

        ObjectMapper mapper = new ObjectMapper();
        Foods response1 = mapper.readValue(jsonStr.readEntity(String.class), Foods.class);
        FoodsItem foodsItem = response1.getFoods().get(0);
        assertEquals(52, foodsItem.getNfCalories());

    }


    @Test
    public void testApiJSON() throws Exception {

        APIService apiService = new APIService();
        String postBody = "dragon fruit 100 grams";
        FoodsItem foodsItem = apiService.getFoodValues(postBody);
        assertEquals(30, foodsItem.getNfCalories());
    }


}
