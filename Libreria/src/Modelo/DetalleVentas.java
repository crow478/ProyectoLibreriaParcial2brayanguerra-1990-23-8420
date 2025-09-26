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
public class DetalleVentas {
    int id;
    int idVenats;
    int idProducto;
    int cantidad;
    double preventa;

    public DetalleVentas() {
    }

    public DetalleVentas(int id, int idVenats, int idProducto, int cantidad, double preventa) {
        this.id = id;
        this.idVenats = idVenats;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.preventa = preventa;
    }

    public int getId() {
        return id;
    }

    public int getIdVenats() {
        return idVenats;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPreventa() {
        return preventa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdVenats(int idVenats) {
        this.idVenats = idVenats;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPreventa(double preventa) {
        this.preventa = preventa;
    }

    public void setIdVentas(int idVenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrecio(double precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
