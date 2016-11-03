package agenda.ViewModels;

import agenda.DBConnection.DBRepo;
import agenda.Models.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by gusta on 03/11/2016.
 */
public class PersonaVM {

    public Persona GetPersona(int idPersona){
        try {
            DBRepo con = DBRepo.getConnection();
            String sql = "SELECT * FROM persona WHERE id = " + idPersona;
            ResultSet rs = con.query(sql);

            if(rs.next()){
                return new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("correo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
