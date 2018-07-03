package edu.matc.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import edu.matc.entity.Calorie;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/DateCalories")
public class GraphHelper {

   @GET
    @Path("/json")
    @Produces("application/json")
    public Response getJsonCalories() throws JsonProcessingException {

       Calorie calorie = new Calorie();

       GenericDAO calorieDao = new GenericDAO(Calorie.class);
       List<Calorie> calories = calorieDao.getByPropertyEqual(calorie.getDate(), calorie.getCalorie_value());
       ObjectMapper objectMapper = new ObjectMapper();
       objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
       String arrayToJson = objectMapper.writeValueAsString(calories);

       return Response.status(200).entity(arrayToJson).build();
   }


}
