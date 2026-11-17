/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ucr.ac.cr.cliclab.modelo.Actividad;
import ucr.ac.cr.cliclab.modelo.RegistroActividad;
import ucr.ac.cr.cliclab.modelo.RegistroResultados;
import ucr.ac.cr.cliclab.vista.VentanaActividad;

/**
 *
 * @author jimes
 */
public class ControladorActividad implements ActionListener {
    private ControladorResultados controladorResultados;
    private VentanaActividad ventana;
    private RegistroActividad registroActividad;
    private RegistroResultados resultados;
    private ArrayList<Actividad> actuales;
    private int capitulo;      // 1, 2 o 3
    private int indice;
    private boolean respondida;

    public ControladorActividad(RegistroActividad ra, RegistroResultados rr, ControladorResultados cr) {
        this.registroActividad = ra;
        this.resultados = rr;
        this.controladorResultados = cr;
        this.ventana = new VentanaActividad();
        this.ventana.listenerButton(this);
    }

    public void iniciar(int capitulo) {
        this.capitulo = capitulo;
        this.actuales = registroActividad.getPorCapitulo(capitulo);
        this.indice = 0;
        if (actuales.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Este capítulo aún no tiene actividades");
            return;
        }
        mostrar();
        ventana.setVisible(true);
    }

    private void mostrar() {
        Actividad a = actuales.get(indice);
        ventana.mostrarActividad(a.getEnunciado(), a.getOpciones());
        respondida = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Responder":
                responder();
                break;
            case "Siguiente":
                siguiente();
                break;
            default:
                System.out.println("Comando no reconocido: " + e.getActionCommand());
        }
    }

    private void responder() {
        if (respondida) {
            return;
        }
        String seleccion = ventana.getSeleccion();
        if (seleccion == null) {
            JOptionPane.showMessageDialog(ventana, "Elige una opción antes de responder");
            return;
        }
        Actividad a = actuales.get(indice);
        boolean correcta = a.evaluar(seleccion);       // polimorfismo
        resultados.registrar(capitulo - 1, indice, correcta);
        ventana.mostrarRetroalimentacion(correcta, a.getDescripcion());
        respondida = true;
    }

    private void siguiente() {
        if (!respondida) {
            JOptionPane.showMessageDialog(ventana, "Responde la actividad primero");
            return;
        }
        indice++;
        if (indice < actuales.size()) {
            mostrar();
        } else {
            ventana.setVisible(false);
          ventana.setVisible(false);
    controladorResultados.mostrar();  // luego se cambia por VentanaResultados
        }
    }
}
