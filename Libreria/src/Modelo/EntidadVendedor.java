package Modelo;

public class EntidadVendedor {

    int Id;
    String Nombres;
    String Dpi;
    String Telefono;
    String Estado;
    String usuario;

    // Constructor con parámetros (ya existente)
    public EntidadVendedor(int Id, String Nombres, String Dpi, String Telefono, String Estado, String usuario) {
        this.Id = Id;
        this.Nombres = Nombres;
        this.Dpi = Dpi;
        this.Telefono = Telefono;
        this.Estado = Estado;
        this.usuario = usuario;
    }

    // Constructor sin parámetros (ahora público)
    public EntidadVendedor() {
        // Puedes inicializar los valores por defecto si lo deseas
        this.Id = 0;
        this.Nombres = "";
        this.Dpi = "";
        this.Telefono = "";
        this.Estado = "";
        this.usuario = "";
    }

    public int getId() {
        return Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getDpi() {
        return Dpi;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEstado() {
        return Estado;
    }

    public String getusuario() {
        return usuario;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setDpi(String Dpi) {
        this.Dpi = Dpi;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario ;
    }
}
