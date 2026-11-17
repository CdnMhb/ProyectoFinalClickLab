/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

/**
 *
 * @author jimes
 */
public class ActividadSeleccionUnica extends Actividad {
    private String[] opciones;
    private String correcta;

    public ActividadSeleccionUnica(String titulo, String explicacion, String enunciado,
            int puntos, int numeroCapitulo, String[] opciones, String correcta) {
        super(titulo, explicacion, enunciado, puntos, numeroCapitulo);
        this.opciones = opciones;
        this.correcta = correcta;
    }

    @Override
    public String[] getOpciones() { return opciones; }

    @Override
    public boolean evaluar(String respuesta) {
        return respuesta.equals(correcta);
    }
}
