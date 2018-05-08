package edu.matc.controller;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * This servlet is responsible for updating a user
 */
@WebServlet(
        name = "updateUser",
        urlPatterns = {"/updateUser"}
)
public class UpdateUser extends HttpServlet{
    public void doPost (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession();

        GenericDAO genericDAO = new GenericDAO(User.class);

        String firstName = req.getParameter("thisFName");
        String lastName = req.getParameter("thisLName");

        String userName = req.getParameter("thisUName");

        int userId = Integer.valueOf(req.getParameter("userID"));


        User newUser = (User)genericDAO.getById(userId);

        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setUserName(userName);

        if(!firstName.isEmpty() && !lastName.isEmpty() && !userName.isEmpty()) {

            genericDAO.saveOrUpdate(newUser);
            session.setAttribute("updateMessage", "User " + userName + " has been updated in the database of users");
        } else {
            session.setAttribute("updateMessage", "Please fill all the fields in order to update user.");
        }



         RequestDispatcher dispatcher = req.getRequestDispatcher("updateUserSuccess.jsp");
         dispatcher.forward(req, resp);





    }
}
