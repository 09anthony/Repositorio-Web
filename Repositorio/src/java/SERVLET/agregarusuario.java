/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVLET;

import Modelo.conecta;
import VO.usuario;
import java.sql.*;

/**
 *
 * @author Acmon
 */
public class agregarusuario {
    public static boolean agregarUsuario(usuario usuario){
        boolean agregado = false;
        
        try{
            conecta cn = new conecta();
            
            Connection con = cn.getConnection();
            if (con != null) {
                Statement st;
                st = con.createStatement();
                st.executeUpdate("insert into usuario(mail_usu, contra_usu) values ('"+usuario.getUsuario()+"','"+usuario.getClave()+"')");
                    agregado = true;
                    st.close();
            }
        } catch(Exception e){
            agregado=false;
        }
        return true;
    }
}
