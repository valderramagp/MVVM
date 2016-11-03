package agenda.Test;

import agenda.DBConnection.DBRepo;
import agenda.Models.Persona;
import agenda.ViewModels.PersonaVM;
import agenda.Views.DetallePersona;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by gusta on 03/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        PersonaVM vm = new PersonaVM();
        vm.GetPersona(1);


        /*ArrayList<Persona> personas = vm.GetPersonas();
        for(Persona p : personas){
            System.out.println(p.getNombre());
        }*/

    }
}
