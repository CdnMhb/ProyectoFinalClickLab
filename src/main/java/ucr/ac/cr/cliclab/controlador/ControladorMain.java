/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.controlador;
import ucr.ac.cr.cliclab.vista.FrmMain;
import ucr.ac.cr.cliclab.vista.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.cliclab.modelo.Capitulo;
import ucr.ac.cr.cliclab.modelo.RegistroCapitulo;

/**
 *
 * @author jimes
 */
public class ControladorMain implements ActionListener{
    
     private FrmMain frmMain;
     private VentanaMenu ventanaMenu;
     
    public ControladorMain() {
    this.frmMain = new FrmMain();
    this.frmMain.setVisible(true);
    this.frmMain.listenerMenu(this);

    this.ventanaMenu = new VentanaMenu();

    RegistroCapitulo registroCapitulo = new RegistroCapitulo();
    registroCapitulo.agregar(new Capitulo(1, "Capítulo 1: ISO",
            "Entender cómo el ISO cambia la luz y el ruido de la foto"));
    registroCapitulo.agregar(new Capitulo(2, "Capítulo 2: Velocidad",
            "Entender cómo la velocidad congela o difumina el movimiento"));
    registroCapitulo.agregar(new Capitulo(3, "Capítulo 3: Apertura",
            "Entender cómo la apertura controla la luz y el desenfoque"));

    ControladorCapitulo ctrlCapitulo = new ControladorCapitulo(this.ventanaMenu, registroCapitulo, null);
    new ControladorMenuLibro(this.ventanaMenu, ctrlCapitulo);
}
    @Override
    public void actionPerformed(ActionEvent e) {
    switch (e.getActionCommand()) {
            case "Salir":
                System.exit(0);
                break;
                case"MenuCapitulos":
//                    new ControllerBook(this.registerBook);
                   
                   this.ventanaMenu.setVisible(true);
       
                    break;
                
            default:
                throw new AssertionError();
        }
    }
    
    
    
//    public void actionPerformed(ActionEvent e) {
//        switch (e.getActionCommand()) {
//            case "Exit":
//                System.exit(0);
//                break;
//                case"Book":
//                    new ControllerBook(this.registerBook);
//                    break;
//                case "Page":
//                    //crear controllador de la pagina
//                    //poner this.el refistro q cree arriba al llamarlo
//                    new ControllerPage(this.registerPage);
//                    
//                    
//                    break;
//                
//            default:
//                throw new AssertionError();
//        }
//    }
    
}
