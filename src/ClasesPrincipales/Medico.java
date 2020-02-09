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
public class Medico {
    int dni;
    String Médico;
    String Especialidad;
    String dia;
    String Horario;
    int Cupos;

    public Medico() {
    }

    public Medico(int dni, String Médico, String Especialidad, String dia, String Horario, int Cupos) {
        this.dni = dni;
        this.Médico = Médico;
        this.Especialidad = Especialidad;
        this.dia = dia;
        this.Horario = Horario;
        this.Cupos = Cupos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getMédico() {
        return Médico;
    }

    public void setMédico(String Médico) {
        this.Médico = Médico;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getCupos() {
        return Cupos;
    }

    public void setCupos(int Cupos) {
        this.Cupos = Cupos;
    }
    
    
    
    
}
