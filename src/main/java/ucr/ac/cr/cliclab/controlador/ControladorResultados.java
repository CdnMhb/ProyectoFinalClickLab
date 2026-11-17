/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.cliclab.modelo.RegistroResultados;
import ucr.ac.cr.cliclab.vista.VentanaMenu;
import ucr.ac.cr.cliclab.vista.VentanaResultados;
/**
 *
 * @author jimes
 */
public class ControladorResultados implements ActionListener {

  
     private VentanaResultados ventana;
    private VentanaMenu ventanaMenu;
    private RegistroResultados resultados;
    public ControladorResultados(VentanaMenu ventanaMenu, RegistroResultados resultados) {
        this.ventanaMenu = ventanaMenu;
        this.resultados = resultados;
        this.ventana = new VentanaResultados();
        this.ventana.listenerButton(this);
    }
    public void mostrar() {
        this.ventana.mostrarResumen(construirResumen());
        this.ventanaMenu.setVisible(false);
        this.ventana.setVisible(true);
    }
    
    private String construirResumen() {
    int respondidas = resultados.getTotalRespondidas();
    if (respondidas == 0) {
        return "Todavía no has respondido ninguna actividad.";
    }

    String resumen = "";
    int[] aciertos = resultados.getAciertosPorCapitulo();
    for (int i = 0; i < aciertos.length; i++) {
        if (resultados.getRespondidas(i) > 0) {
            resumen = resumen + "Capítulo " + (i + 1) + ": " + aciertos[i]
                    + " aciertos, " + resultados.getErrores(i) + " errores\n";
        }
    }

    int totalAciertos = resultados.getTotalAciertos();
    resumen = resumen + "\nTotal respondidas: " + respondidas + "\n";
    resumen = resumen + "Aciertos: " + totalAciertos + "\n";
    resumen = resumen + "Errores: " + (respondidas - totalAciertos) + "\n";
    resumen = resumen + "Porcentaje de desempeño: " + Math.round(resultados.getPorcentaje()) + "%";
    return resumen;
}
      @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "NuevoIntento":
                resultados.reiniciar();
                JOptionPane.showMessageDialog(ventana, "Intento reiniciado. Ya puedes volver a responder.");
                ventana.mostrarResumen(construirResumen());
                break;
            case "VolverMenu":
                ventana.setVisible(false);
                ventanaMenu.setVisible(true);
                break;
            default:
                System.out.println("Comando no reconocido: " + e.getActionCommand());
        }
    }
}
    

