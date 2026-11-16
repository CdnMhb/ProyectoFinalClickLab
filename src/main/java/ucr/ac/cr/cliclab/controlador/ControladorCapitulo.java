/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
  package ucr.ac.cr.cliclab.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ucr.ac.cr.cliclab.modelo.Capitulo;
import ucr.ac.cr.cliclab.modelo.RegistroCapitulo;
import ucr.ac.cr.cliclab.vista.PanelCap1;
import ucr.ac.cr.cliclab.vista.PanelCap2;
import ucr.ac.cr.cliclab.vista.PanelCap3;
import ucr.ac.cr.cliclab.vista.PanelCap4;
import ucr.ac.cr.cliclab.vista.PanelCap5;
import ucr.ac.cr.cliclab.vista.VentanaCapitulo;
import ucr.ac.cr.cliclab.vista.VentanaMenu;

/**
 *
 * @author jimes
 */

  

public class ControladorCapitulo implements ActionListener {

    private VentanaCapitulo ventana;
    private VentanaMenu ventanaMenu;
    private RegistroCapitulo registroCapitulo;
    private ControladorActividad controladorActividad;
    private JPanel[] paneles;
    private int capituloActual;

    public ControladorCapitulo(VentanaMenu ventanaMenu, RegistroCapitulo registroCapitulo,
                               ControladorActividad controladorActividad) {
        this.ventanaMenu = ventanaMenu;
        this.registroCapitulo = registroCapitulo;
        this.controladorActividad = controladorActividad;

        this.ventana = new VentanaCapitulo();
        this.ventana.listenerButton(this);

        this.paneles = new JPanel[5];
        this.paneles[0] = new PanelCap1();
        this.paneles[1] = new PanelCap2();
        this.paneles[2] = new PanelCap3();
        this.paneles[3] = new PanelCap4();
        this.paneles[4] = new PanelCap5();
    }

    public void abrir(int numero) {
        Capitulo c = registroCapitulo.buscar(numero);
        if (c == null) {
            JOptionPane.showMessageDialog(null, "Este capítulo aún no está listo");
            return;
        }
        this.capituloActual = numero;
        this.ventana.mostrarCapitulo(c.getTitulo(), paneles[numero - 1]);
        this.ventanaMenu.setVisible(false);
        this.ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Actividades":
                this.ventana.setVisible(false);
                this.controladorActividad.iniciar(this.capituloActual);
                break;
            case "VolverMenu":
                this.ventana.setVisible(false);
                this.ventanaMenu.setVisible(true);
                break;
            default:
                System.out.println("Comando no reconocido: " + e.getActionCommand());
        }
    }
}

