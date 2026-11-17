/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

import java.util.ArrayList;

/**
 *
 * @author jimes
 */
public class RegistroActividad {
    private ArrayList<Actividad> actividades;

    public RegistroActividad() {
        this.actividades = new ArrayList<>();
    }

    public void agregar(Actividad a) {
        actividades.add(a);
    }

    public ArrayList<Actividad> getPorCapitulo(int numeroCapitulo) {
        ArrayList<Actividad> resultado = new ArrayList<>();
        for (Actividad a : actividades) {
            if (a.getNumeroCapitulo() == numeroCapitulo) {
                resultado.add(a);
            }
        }
        return resultado;
    }
        public void cargarActividades() {
        agregar(new ActividadSeleccionUnica("ISO 1",
                "Un ISO alto hace el sensor más sensible a la luz, pero agrega ruido.",
                "¿Qué pasa si subes el ISO?", 10, 1,
                new String[]{"La imagen se aclara y aparece ruido", "La imagen se oscurece", "No cambia nada"},
                "La imagen se aclara y aparece ruido"));

        agregar(new ActividadVerdaderoFalso("ISO 2",
                "Con mucha luz basta un ISO bajo, y la foto sale más limpia.",
                "Con mucha luz conviene usar un ISO bajo.", 10, 1, true));
    }
}
