package edu.matc.controller;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "updateUser",
        urlPatterns = {"/updateUser"}
)
public class UpdateUser extends HttpServlet{
    public void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
