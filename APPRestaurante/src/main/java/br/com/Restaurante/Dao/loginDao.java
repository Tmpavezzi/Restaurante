package br.com.Restaurante.Dao;

import br.com.Restaurante.Model.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 public class loginDao {
    public void createlogin (login login){

        String SQL = "INSERT INTO LOGIN (NOME,EMAIL,TELEFONE,ENDERECO,SENHA) VALUES (?,?,?,?,?)";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, login.getNome());
            preparedStatement.setString(2,login.getEmail());
            preparedStatement.setString(3,login.getTelefone());
            preparedStatement.setString(4,login.getEndereco());
            preparedStatement.setString(5,login.getSenha());

            preparedStatement.execute();

            System.out.println("success ");

            connection.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}

