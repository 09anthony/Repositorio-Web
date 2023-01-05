/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.*;

/**
 *
 * @author ANTHONY
 */
public class mostrarautor {
    public static boolean mostrarAutor( autor autor){
        boolean mostrado = false;
        String cod = "";
        String nom = "";
        String lib = "";
        
        try{
            conecta cn = new conecta();
            
            Connection con = cn.getConnection();
            if (con != null) {
                Statement st;
                ResultSet rs;
                st = con.createStatement();
                rs = st.executeQuery("select * from autores");
                rs.beforeFirst();
                while(rs.next())
                {
                    cod = rs.getString(1);
                    nom = rs.getString(2);
                    lib = rs.getString(3);
                }
                    mostrado = true;
                    st.close();
            }
        } catch(Exception e){
            mostrado=false;
        }
        return true;
    }
}
