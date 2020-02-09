/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesPrincipales;

/**
 *
 * @author Alex
 */
public class Ingreso {
    
    String id_cama;
    String fecha_ingreso;
    String fecha_salida;
    int dni;

    public Ingreso() {
    }

    public Ingreso(String id_cama, String fecha_ingreso, String fecha_salida, int dni) {
        this.id_cama = id_cama;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.dni = dni;
    }

    public String getId_cama() {
        return id_cama;
    }

    public void setId_cama(String id_cama) {
        this.id_cama = id_cama;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
    
    
    
    
    
    
    
}
