/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

/**
 *
 * @author jimes
 */
public class ActividadVerdaderoFalso extends Actividad {
    private boolean correcta;

    public ActividadVerdaderoFalso(String titulo, String explicacion, String enunciado,
            int puntos, int numeroCapitulo, boolean correcta) {
        super(titulo, explicacion, enunciado, puntos, numeroCapitulo);
        this.correcta = correcta;
    }

    @Override
    public String[] getOpciones() { return new String[]{"Verdadero", "Falso"}; }

    @Override
    public boolean evaluar(String respuesta) {
        String esperada = correcta ? "Verdadero" : "Falso";
        return respuesta.equals(esperada);
    }
}