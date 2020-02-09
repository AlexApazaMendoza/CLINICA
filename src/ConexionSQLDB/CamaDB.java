/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSQLDB;

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
public class CamaDB {
    
    Connection cnx = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    //ACTUALIZAR DATOS DEL CLIENETS
    public void Update(String idcama, String dni) {
        try {
            cnx = DataBaseConnection.getConneccion();
            pst = cnx.prepareStatement("update cama set dni_fkpa1="+dni+"\n" +
                    " where cama.IDCAMA='"+idcama+"'");

            pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CamaDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
