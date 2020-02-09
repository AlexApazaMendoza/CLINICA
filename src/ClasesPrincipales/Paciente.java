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
public class Paciente {
    int dni;
    String nombres;
    String apellidos;
    String direccion;
    int telefono;
    String seguro_social;
    
    public Paciente() {
    }
    
    public Paciente(int dni, String nombres, String apellidos, String direccion, int telefono, String seguro_social) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.seguro_social = seguro_social;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getSeguro_social() {
        return seguro_social;
    }

    public void setSeguro_social(String seguro_social) {
        this.seguro_social = seguro_social;
    }
    
    
    
    
    
}
