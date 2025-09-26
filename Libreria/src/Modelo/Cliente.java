/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Cliente {
    int Id;
    String Dpi;
    String Nombres;
    String Direccion;
    String Estado;

    public Cliente() {
    }

    public Cliente(int Id, String Dpi, String Nombres, String Direccion, String Estado) {
        this.Id = Id;
        this.Dpi = Dpi;
        this.Nombres = Nombres;
        this.Direccion = Direccion;
        this.Estado = Estado;
    }

    public int getId() {
        return Id;
    }

    public String getDpi() {
        return Dpi;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setDpi(String Dpi) {
        this.Dpi = Dpi;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
}
