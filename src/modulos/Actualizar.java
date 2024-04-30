/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulos;

import java.sql.*;

/**
 *
 * @author Guigo
 */
public class Actualizar {
    
    public static void main (String[] args) {
        
        String usuario="root";
        String password="murdock1984-";
        String url="jdbc:mysql://localhost:3306/control";
        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion= DriverManager.getConnection(url,usuario,password);
            statement= conexion.createStatement();
            
            statement.executeUpdate("UPDATE CLIENTES SET NOMBRE = 'RODRIGO' WHERE NOMBRE = 'DIEGO'");
            rs = statement.executeQuery("SELECT * FROM CLIENTES");
            rs.next();
            
            do{
                System.out.println(rs.getInt("IDCLIENTES")+ ":"+ rs.getString("CEDULA")+":"+ rs.getString("NOMBRE")+":"+ rs.getString("APELLIDO")+ ":"+ rs.getString("CORREO") + ":"+ rs.getString("TELEFONO"));
                } while (rs.next());
        }
        catch (ClassNotFoundException | SQLException ex){
                ex.printStackTrace();
                }    
    }
    
}

