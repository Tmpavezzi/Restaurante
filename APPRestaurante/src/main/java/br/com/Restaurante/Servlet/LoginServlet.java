package br.com.Restaurante.Servlet;

import br.com.Restaurante.Dao.UserDao;
import br.com.Restaurante.Model.login;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.ResultSet;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("username");
       String senha = req.getParameter("password");

        var login = new login(email,senha);
        boolean isValidUser = new UserDao().verifyCredential(email,senha);

        if (isValidUser) {
            req.getSession().setAttribute("loggeduser", email);
            req.getRequestDispatcher("home.jsp").forward(req,resp);
        } else {
            req.setAttribute("message", "Invalid credentials!");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
