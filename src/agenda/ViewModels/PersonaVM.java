package agenda.ViewModels;

import agenda.DBConnection.DBRepo;
import agenda.Models.Persona;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by gusta on 03/11/2016.
 */
public class PersonaVM {

    public Persona GetPersona(int idPersona){
        try {
            Connection con = DBRepo.getConnection();
            Statement stmnt = con.createStatement();
            String sql = "SELECT * FROM persona WHERE id = " + idPersona;
            ResultSet rs = stmnt.executeQuery(sql);
            if(rs.next()){
                return new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("correo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
