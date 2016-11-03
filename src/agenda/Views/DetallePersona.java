package agenda.Views;

import agenda.Models.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gusta on 03/11/2016.
 */
public class DetallePersona {
    private JTextField txtNombre;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JPanel DetallePersona;
    private JButton REGRESARButton;

    public DetallePersona() {
        REGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Presionaste el botón!");
            }
        });
    }

    public DetallePersona(Persona persona){
        JFrame frame = new JFrame("DetallePersona");
        agenda.Views.DetallePersona dp = new DetallePersona();
        frame.setContentPane(dp.DetallePersona);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        dp.txtNombre.setText(persona.getNombre());
        frame.setVisible(true);
    }
}
