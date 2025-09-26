package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VendedorDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    // Cambié la inicialización del objeto ev para evitar null
    Coneccion con = new Coneccion();
    Connection acceso;

    public EntidadVendedor ValidarVendedor(String Dpi, String usuario) {
        String sql = "SELECT * FROM vendedor WHERE Dpi=? AND usuario=?";
        EntidadVendedor ev = null; // Inicializamos en null por defecto
        
        try {
            acceso = con.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, Dpi);
            ps.setString(2, usuario);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                ev = new EntidadVendedor();  // Inicializamos el objeto solo si se encuentra
                ev.setId(rs.getInt(1));
                ev.setDpi(rs.getString(2));
                ev.setNombres(rs.getString(3));
                ev.setTelefono(rs.getString(4));
                ev.setEstado(rs.getString(5));
                ev.setusuario(rs.getString(6));
            } else {
                // Si no se encuentra el vendedor, 'ev' ya es null
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (acceso != null) acceso.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return ev; // Si 'ev' sigue siendo null, significa que no se encontró el vendedor
    }
}
