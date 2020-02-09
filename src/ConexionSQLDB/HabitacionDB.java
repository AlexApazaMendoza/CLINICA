/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQLDB;

import ClasesPrincipales.Habitacion;
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
public class HabitacionDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    //LISTADO DEL CLIENTE    
    public ArrayList<Habitacion> getListadosHabitacion() {
        ArrayList<Habitacion> ha = new ArrayList<>();
        try {
            cnx = DataBaseConnection.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("select\n" +
" Planta.NOMBRE as Planta,\n" +
" Cama.IDCAMA,\n" +
" Habitacion.NUMERO as Habitacion,\n" +
" Cama.LETRA\n" +
" from Cama\n" +
" inner join Habitacion on Habitacion.IDHABITACION=Cama.IDHABITACION_FKH\n" +
" inner join Planta on Planta.IDPLANTA=Habitacion.IDPLANTA_FKPL\n" +
" where Cama.DNI_FKPA1 is null");
            while (rs.next()) {
                Habitacion h = new Habitacion();
                h.setNombre(rs.getString(1));
                h.setCodigo(rs.getString(2));
                h.setNumero(rs.getInt(3));
                h.setLetra(rs.getString(4));
                ha.add(h);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return ha;
    }
    
    
    
    
    
}
