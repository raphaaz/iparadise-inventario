package org.example.db;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexionDB {

    private static Connection conexion;

    public static Connection getConexion() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            Properties props = cargarPropiedades();
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            conexion = DriverManager.getConnection(url, user, password);
        }
        return conexion;
    }

    private static Properties cargarPropiedades() {
        Properties props = new Properties();
        try (InputStream input = ConexionDB.class.getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("No se encontró config.properties");
            }
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar config.properties", e);
        }
        return props;
    }
}