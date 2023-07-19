package br.com.Restaurante.Servlet;

import br.com.Restaurante.Model.login;
import br.com.Restaurante.Dao.loginDao;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-login")
public class CreateloginServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String Nome = request.getParameter("nome");
        String Email=request.getParameter("email");
        String Telefone= request.getParameter("telefone");
        String Endereco = request.getParameter("endereco");
        String Senha=request.getParameter("senha");


        login login = new login(Nome,Email,Telefone,Endereco,Senha);
        new loginDao().createlogin(login);



        request.getRequestDispatcher("Cadastrados.jsp").forward(request,response);


    }

}
