/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ANTHONY
 */
import java.sql.*;

public class conecta {
     private Connection con = null;
    
    public conecta(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/upsjb?zeroDateTimeBehavior=convertToNull","root","12345678");
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        return con;
    }
    
    public void cerrarConexion(){
        try{
            con.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
}
