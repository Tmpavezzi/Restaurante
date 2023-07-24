package br.com.Restaurante.Dao;

import br.com.Restaurante.Model.login;

import java.sql.*;


public class UserDao {

    public boolean verifyCredential(String Email,String Senha) {
        String SQL = "SELECT * FROM LOGIN WHERE EMAIL = ?";

        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","sa");
            System.out.println("sucess in connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
               preparedStatement.setString(1,Email);


            ResultSet rs= preparedStatement.executeQuery();
            System.out.println("sucess in select email");

            while (rs.next()){
                String senha = rs.getString("senha");
                if(senha.equals(Senha)){
                    return  true;
                }
            }
            connection.close();
            return false;


        }catch (Exception e){
            System.out.println("Fail in connection da valida��o");
            System.out.println(e.getMessage());
            return false;
        }



    }




}



