package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao implements CRUD {
    Connection con;
    Coneccion cn = new Coneccion();
    PreparedStatement ps;
    ResultSet rs;

    // Obtener un producto por IdProducto
    public Producto listarID(int idProducto) {
        Producto p = new Producto();
        String sql = "SELECT * FROM producto WHERE IdProducto=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));            // IdProducto
                p.setNombres(rs.getString(2));    // Nombres
                p.setPrecio(rs.getDouble(3));     // Precio
                p.setStock(rs.getInt(4));         // Stock
                p.setEstado(rs.getString(5));     // Estado
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException ignored) {}
            try { if (ps != null) ps.close(); } catch (SQLException ignored) {}
            try { if (con != null) con.close(); } catch (SQLException ignored) {}
        }
        return p;
    }

    @Override
    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM producto";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getInt(1));            // IdProducto
                p.setNombres(rs.getString(2));    // Nombres
                p.setPrecio(rs.getDouble(3));     // Precio
                p.setStock(rs.getInt(4));         // Stock
                p.setEstado(rs.getString(5));     // Estado
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (rs != null) rs.close(); } catch (SQLException ignored) {}
            try { if (ps != null) ps.close(); } catch (SQLException ignored) {}
            try { if (con != null) con.close(); } catch (SQLException ignored) {}
        }
        return lista;
    }

    @Override
public int add(Object[] o) {
    // Espera: o[0]=IdProducto, o[1]=Nombres, o[2]=Precio(Double), o[3]=Stock(Integer), o[4]=Estado
    int r = 0;
    String sql = "INSERT INTO producto (IdProducto, Nombres, Precio, Stock, Estado) VALUES (?,?,?,?,?)";
    try {
        con = cn.conectar();
        ps = con.prepareStatement(sql);
        ps.setObject(1, o[0]); // IdProducto
        ps.setObject(2, o[1]); // Nombres
        ps.setObject(3, o[2]); // Precio
        ps.setObject(4, o[3]); // Stock
        ps.setObject(5, o[4]); // Estado
        r = ps.executeUpdate();
        System.out.println("Insert ejecutado, filas afectadas: " + r);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try { if (ps != null) ps.close(); } catch (SQLException ignored) {}
        try { if (con != null) con.close(); } catch (SQLException ignored) {}
    }
    return r;
}


    @Override
    public int actualizar(Object[] o) {
        // Espera: o[0]=Nombres, o[1]=Precio(Double), o[2]=Stock(Integer), o[3]=Estado, o[4]=IdProducto
        int r = 0;
        String sql = "UPDATE producto SET Nombres=?, Precio=?, Stock=?, Estado=? WHERE IdProducto=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (ps != null) ps.close(); } catch (SQLException ignored) {}
            try { if (con != null) con.close(); } catch (SQLException ignored) {}
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM producto WHERE IdProducto=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try { if (ps != null) ps.close(); } catch (SQLException ignored) {}
            try { if (con != null) con.close(); } catch (SQLException ignored) {}
        }
    }
}
