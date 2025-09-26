package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Coneccion {
    Connection con;
    String url = "jdbc:mysql://localhost:3307/libreria";
    String user = "root";
    String pass = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // 👈 usa el driver actualizado
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }
}
    