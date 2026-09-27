package org.example;

import org.example.db.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionDB.getConexion();
            System.out.println("Conexión exitosa a Supabase");
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

