package agenda.Test;

import agenda.DBConnection.DBRepo;
import agenda.Models.Persona;
import agenda.ViewModels.PersonaVM;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by gusta on 03/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        PersonaVM vm = new PersonaVM();
        Persona persona = vm.GetPersona(1);
        System.out.println(persona.getNombre());
    }
}
