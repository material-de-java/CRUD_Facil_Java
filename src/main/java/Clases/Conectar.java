/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author deniw
 */
public class Conectar {
    Connection cn;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bd_test","root","");
            
            System.out.println("conectado");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error en la conexion");
            
        }
        
        return cn;
    
    }
    
}
