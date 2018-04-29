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

@WebServlet(
        name = "deleteUser",
        urlPatterns = {"/deleteUser"}
)
public class DeleteUser extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        GenericDAO genericDAO = new GenericDAO(User.class);
        GenericDAO userRole = new GenericDAO(Role.class);

        int userId = Integer.valueOf(request.getParameter("userID"));

        User user = (User)genericDAO.getById(userId);

        genericDAO.delete(user);

        session.setAttribute("deleteMessage", "User " + user.getUserName() + " was deleted");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/deleteUserSuccess.jsp");
        dispatcher.forward(request, response);
    }
}
