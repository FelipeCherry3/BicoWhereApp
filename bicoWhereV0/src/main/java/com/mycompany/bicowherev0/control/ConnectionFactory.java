/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicowherev0.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Pc Elaine
 */
public class ConnectionFactory {
    public static Connection createConnectionToMySQL() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/bicoapp";
        String user = "root";
        String password = "Bico1346@";
        
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
        
    }
}
