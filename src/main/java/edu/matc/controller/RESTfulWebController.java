/**package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.util.List;

@Path("/RestUsers")
public class RESTfulWebController {

    GenericDAO userDao = new GenericDAO(User.class);

    @GET
    @Produces("text/plain")
    public List<User> getUsers() {

        List listOfUsers = userDao.getAll();
        return listOfUsers;
    }

}
*/