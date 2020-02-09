/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQLDB;

import ClasesPrincipales.Ingreso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class IngresoDB {
    
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    //INSERTAR INGRESO
    public void InserInto(String idcama,String finicio,String ffin,String dni) {
        
        /*ESTA IDEA SE ME OCURRIO*/
        try {
            cnx = DataBaseConnection.getConneccion();
            pst = cnx.prepareStatement("Insert into Ingreso values(ingresoid.NEXTVAL,'"+idcama+"',TO_DATE('"+finicio+" 08:00:00 ', 'yyyy/mm/dd hh:mi:ss'),TO_DATE('"+ffin+" 08:00:00 ', 'yyyy/mm/dd hh:mi:ss'),"+dni+")");
            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        //y funcionó xd
    }
}
