/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bicowherev0.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Pc Elaine
 */
public class TestarConexao {
        public static void main(String[] args) {
        try (Connection conn = ConnectionFactory.createConnectionToMySQL()) {
            String sql = "SELECT * FROM produtos";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String coluna1 = rs.getString("id");
                String coluna2 = rs.getString("nome_produto");
                System.out.println(coluna1 + " - " + coluna2);
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao conectar ao banco de dados: " + ex.getMessage());
        }
    }
    
}
