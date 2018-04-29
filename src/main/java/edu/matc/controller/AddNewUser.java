package edu.matc.controller;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;
import org.apache.logging.log4j.LogManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet that aids in adding a new user
 * @author avmarks
 */
@WebServlet(
        urlPatterns = {"/addNewUser"}
)
public class AddNewUser extends HttpServlet {

    private final org.apache.logging.log4j.Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GenericDAO genericDAO = new GenericDAO(User.class);

        HttpSession session = req.getSession();

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String password = req.getParameter("password");
        String userName = req.getParameter("userName");
        //String userRole = req.getParameter("userRole");


        User newUser = new User(firstName, lastName, userName, password );
        Role role = new Role(newUser, "registered-user", newUser.getUserName());

        if(!firstName.isEmpty() && !lastName.isEmpty() && !userName.isEmpty() && !password.isEmpty()) {
            newUser.addRole(role);
            genericDAO.insert(newUser);
            session.setAttribute("addMessage", "New user " + userName + " has been added to the database of users");
        } else {
            session.setAttribute("addMessage", "Please fill all the fields in order to register a new user.");
        }

        //resp.sendRedirect("user.jsp");

       // genericDAO.saveOrUpdate(newUser);

       // logger.info("user with these credentials has been added " + newUser);

      // RequestDispatcher dispatcher = req.getRequestDispatcher("user.jsp");
      // dispatcher.forward(req, resp);
        resp.sendRedirect("admin");

    }
}
