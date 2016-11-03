package agenda.Views.Console;

import agenda.ViewModels.PersonaVM;

import java.util.Scanner;

/**
 * Created by gusta on 03/11/2016.
 */
public class MainMenu {
    public MainMenu() {
        int option = 1;
        PersonaVM pvm = new PersonaVM();

        while (option > 0) {
            System.out.println("INGRESE LA OPCIÓN DESEADA");
            System.out.println("1.- Ver todos los contactos");
            System.out.println("2.- Crear Contacto");
            System.out.println("3.- Buscar un contacto");
            System.out.println("4.- Eliminar un contacto");
            System.out.println("0.- Salir");
            Scanner sc = new Scanner(System.in);
            option = sc.nextInt();
            switch (option){
                case 1:
                    pvm.GetPersonas();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del contacto");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese el teléfono del contacto");
                    String tel = sc.nextLine();
                    System.out.println("Ingrese el correo del contacto");
                    String correo = sc.nextLine();
                    pvm.Create(nombre, tel, correo);
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la persona que deseas buscar");
                    int id = sc.nextInt();
                    pvm.GetPersona(id);
                    break;
                case 4:

                    break;
                default:
                    break;
            }
        }
    }
}
