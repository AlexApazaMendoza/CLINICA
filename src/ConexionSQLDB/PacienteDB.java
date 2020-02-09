/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQLDB;

import ClasesPrincipales.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class PacienteDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    //LISTADO DEL CLIENTE    
    public ArrayList<Paciente> getListadosPaciente() {
        ArrayList<Paciente> pa = new ArrayList<>();
        try {
            cnx = DataBaseConnection.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("select dni,nombres,apellidos,direccion,telefono,seguro_social from paciente");
            while (rs.next()) {
                Paciente p = new Paciente();
                p.setDni(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setApellidos(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTelefono(rs.getInt(5));
                p.setSeguro_social(rs.getString(6));
                pa.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pa;
    }
    
    
    //BUSCAR DATOS DE CLIENTES
    public Paciente getSelect(String buscar) {
        Paciente p = null;
        try {
            cnx = DataBaseConnection.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("SELECT dni,nombres,apellidos,direccion,telefono,seguro_social"
                    + " FROM paciente "
                    + " WHERE dni='"+buscar+"' ");
            while (rs.next()) {
                p = new Paciente();
                p.setDni(rs.getInt(1));
                p.setNombres(rs.getString(2));
                p.setApellidos(rs.getString(3));
                p.setDireccion(rs.getString(4));
                p.setTelefono(rs.getInt(5));
                p.setSeguro_social(rs.getString(6));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return p;
    }
}

