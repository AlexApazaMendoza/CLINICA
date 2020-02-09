/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQLDB;

import ClasesPrincipales.Medico;
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
public class MedicoDB {
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    //LISTADO DEL CLIENTE    
    public ArrayList<Medico> getListadosMedico() {
        ArrayList<Medico> me = new ArrayList<>();
        try {
            cnx = DataBaseConnection.getConneccion();
            st = cnx.createStatement();
            rs = st.executeQuery("select dni,apellidos ||' '|| nombres as Médico,Especialidad.nombre as Especialidad, dia, TO_CHAR(hora_inicio,'HH24:MI') ||'-'|| TO_CHAR(hora_fin,'HH24:MI') as Horario, cupos as Cupos from Dia\n" +
"  inner join Medico on Dia.IDMEDICO_FKM1=Medico.IDMEDICO\n" +
"  inner join Horario on Dia.IDHORARIO_FKH= Horario.IDHORARIO\n" +
"  inner join Especialidad on Especialidad.idespecialidad=Medico.idespecialidad_fke\n" +
"  order by Medico.IDMEDICO");
            while (rs.next()) {
                Medico m = new Medico();
                m.setDni(rs.getInt(1));
                m.setMédico(rs.getString(2));
                m.setEspecialidad(rs.getString(3));
                m.setDia(rs.getString(4));
                m.setHorario(rs.getString(5));
                m.setCupos(rs.getInt(6));
                me.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return me;
    }
    
    
    
    
    
    
}
