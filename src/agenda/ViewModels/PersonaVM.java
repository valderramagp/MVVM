package agenda.ViewModels;

import agenda.DBConnection.DBRepo;
import agenda.Models.Persona;
import agenda.Views.DetallePersona;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by gusta on 03/11/2016.
 */
public class PersonaVM {
    private DBRepo con;

    public PersonaVM(){
        con = DBRepo.getConnection();
    }

    public ArrayList<Persona> GetPersonas() {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        String sql = "SELECT * FROM persona";
        try {
            ResultSet rs = con.query(sql);
            while (rs.next()){
                Persona  persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("correo"));
                personas.add(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personas;
    }

    public void GetPersona(int idPersona){
        try {

            String sql = "SELECT * FROM persona WHERE id = " + idPersona;
            ResultSet rs = con.query(sql);

            if(rs.next()){
                Persona persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("telefono"), rs.getString("correo"));
                DetallePersona dp = new DetallePersona(persona);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
