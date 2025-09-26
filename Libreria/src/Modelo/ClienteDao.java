package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao implements CRUD {
    Connection con;
    Coneccion cn = new Coneccion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Cliente listarID(String dpi){
        Cliente c = new Cliente();
     String sql="select * from cliente where Dpi=?";
        try {
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dpi);
            rs=ps.executeQuery();
            while (rs.next()){
                c.setId(rs.getInt(1));
                c.setDpi(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setEstado(rs.getString(5));
                
               
            
            }
        } catch (Exception e) {
        }
    return c;
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "Select * From cliente";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);  // Corregido el método para obtener el PreparedStatement
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDpi(rs.getString(2));
                c.setNombres(rs.getString(3));
                c.setDireccion(rs.getString(4));
                c.setEstado(rs.getString(5));
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();  // Para registrar el error
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "Insert into cliente (Dpi, Nombres, Direccion, Estado) values(?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
            
            System.out.println("Insert ejecutado, filas afectadas: " + r);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "Update cliente set Dpi=?, Nombres=?, Direccion=?, Estado=? where IdCliente=?";
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
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from cliente where IdCliente=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}