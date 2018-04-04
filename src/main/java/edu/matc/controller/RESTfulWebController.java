package edu.matc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.matc.entity.User;
import edu.matc.entity.Users;
import edu.matc.persistence.GenericDAO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;

@Path("/RestUsers")
public class RESTfulWebController {

    @GET
    @Path("/json")
    // Define what type of content is produced
    @Produces("application/json")
    public Response getJsonUsers() throws JsonProcessingException {
        // get the users
        GenericDAO userDao = new GenericDAO(User.class);
        List<User> users = userDao.getAll();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String arrayToJson = objectMapper.writeValueAsString(users);
        return Response.status(200).entity(arrayToJson).build();

    }
    @GET
    @Path("/xml")
    // Define what type of content is produced
    @Produces("application/xml")
    public Response getXMLUsers() throws JsonProcessingException, JAXBException {
        // get the users
        GenericDAO userDao = new GenericDAO(User.class);
        List<User> users = userDao.getAll();
        Users userList = new Users();
        userList.setUsers(users);
        StringWriter xmlResult = new StringWriter();
        JAXBContext jaxbContext = JAXBContext.newInstance(Users.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(userList, xmlResult);

        return Response.status(200).entity(xmlResult.toString()).build();
    }



}
