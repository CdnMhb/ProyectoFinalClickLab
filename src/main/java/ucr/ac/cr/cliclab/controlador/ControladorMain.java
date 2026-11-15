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

/**
 *
 * @author jimes
 */
public class ControladorMain implements ActionListener{
    
     private FrmMain frmMain;
     private VentanaMenu ventanaMenu;
     
     public ControladorMain(){
        this.frmMain=new FrmMain();
        this.frmMain.setVisible(true);
        this.frmMain.listenerMenu(this);
        
        this.ventanaMenu=new VentanaMenu();
       
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
        this.ventanaMenu.listenerButton(this);
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
