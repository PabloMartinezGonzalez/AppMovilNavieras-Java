/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author pacor
 */
public class Reserva {
    private String Fecha;
    private String Hora;
    private String Ruta;
    private int Billetes;
    private double importe;
    private boolean movRed;
    private boolean guia;
    private String Nombre;
    private String Dni;
    private String Correo; 
    private String Telefono;
    private String codPostal;
    private String Targeta;
    private String Caducidad;
    private String CVV;
    private String IdiomaG;
    
    
    public Reserva() {
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getIdiomaG() {
        return IdiomaG;
    }

    public void setIdiomaG(String IdiomaG) {
        this.IdiomaG = IdiomaG;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getBilletes() {
        return Billetes;
    }

    public void setBilletes(int Billetes) {
        this.Billetes = Billetes;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isMovRed() {
        return movRed;
    }

    public void setMovRed(boolean movRed) {
        this.movRed = movRed;
    }

    public boolean isGuia() {
        return guia;
    }

    public void setGuia(boolean guia) {
        this.guia = guia;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getTargeta() {
        return Targeta;
    }

    public void setTargeta(String Targeta) {
        this.Targeta = Targeta;
    }

    public String getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(String Caducidad) {
        this.Caducidad = Caducidad;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
}
