/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Notebook
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class VentasDao {
    Coneccion cn = new Coneccion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
  
    public String IdVentas(){
        String idv="";
       String sql = "SELECT MAX(IdVentas) FROM ventas";

        
        try {
          con = cn.conectar();
           ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
           while(rs.next()){
           idv=rs.getString(1);
           
           }
        } catch (Exception e) {
        }
        return idv;
       
    }
  public int GuardarVentas(Ventas v) {
    int id = 0;
    String sql = "INSERT INTO ventas(Cliente_IdCliente,Vendedor_IdVendedor,NumeroVentas,FechaVentas,Monto,Estado) VALUES (?,?,?,?,?,?)";
    try {
       con = cn.conectar();

        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, v.getIdCliente());
        ps.setInt(2, v.getIdVendedor());

        // Validar serie
        String serie = (v.getSerie() == null || v.getSerie().trim().isEmpty()) 
                       ? "S" + System.currentTimeMillis() 
                       : v.getSerie();
        ps.setString(3, serie);

        // Convertir fecha a java.sql.Date
        java.sql.Date sqlDate = java.sql.Date.valueOf(v.getFecha()); 
        ps.setDate(4, sqlDate);

        ps.setDouble(5, v.getMonto());
        ps.setString(6, v.getEstado());

        ps.executeUpdate();
        rs = ps.getGeneratedKeys();
        if (rs.next()) {
            id = rs.getInt(1); // obtiene el ID autogenerado
        }
    } catch (Exception e) {
        e.printStackTrace(); // 👈 ver error completo
        JOptionPane.showMessageDialog(null, "Error al registrar la venta: " + e.getMessage());
    }
    return id;
}


    public int GuardarDettalleVentas(DetalleVentas dv) {
    String sql = "INSERT INTO detalle_ventas(Ventas_IdVentas, Producto_IdProducto, Cantidad, PrecioVenta) VALUES (?, ?, ?, ?)";
    try {
        con = cn.conectar();
        ps = con.prepareStatement(sql);
        ps.setInt(1, dv.getIdVenats());
        ps.setInt(2, dv.getIdProducto());
        ps.setInt(3, dv.getCantidad());
        ps.setDouble(4, dv.getPreventa());

        r = ps.executeUpdate();
    } catch (Exception e) {
        System.out.println("Error GuardarDetalleVentas: " + e.getMessage());
    }
    return r;
}

    public void GuardarDetalleVentas(DetalleVentas dv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    
    
    
}
