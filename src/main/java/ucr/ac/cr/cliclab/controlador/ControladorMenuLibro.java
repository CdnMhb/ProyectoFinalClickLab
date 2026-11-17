/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.cliclab.vista.VentanaMenu;

/**
 *
 * @author mathi
 */


public class ControladorMenuLibro implements ActionListener {

    private VentanaMenu ventanaMenu;
    private ControladorCapitulo controladorCapitulo;
    private ControladorResultados controladorResultados;

    public ControladorMenuLibro(VentanaMenu ventanaMenu, ControladorCapitulo controladorCapitulo, ControladorResultados controladorResultados) {
        this.ventanaMenu = ventanaMenu;
        this.controladorCapitulo = controladorCapitulo;
        this.controladorResultados = controladorResultados;
        this.ventanaMenu.listenerButton(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Cap1": controladorCapitulo.abrir(1); break;
            case "Cap2": controladorCapitulo.abrir(2); break;
            case "Cap3": controladorCapitulo.abrir(3); break;
            case "Cap4": controladorCapitulo.abrir(4); break;
            case "Cap5": controladorCapitulo.abrir(5); break;
            case "Resultados":
               controladorResultados.mostrar();
                break;
            case "Inicio":
                this.ventanaMenu.setVisible(false);
                break;
            default:
                System.out.println("Comando no reconocido: " + e.getActionCommand());
        }
    }
}