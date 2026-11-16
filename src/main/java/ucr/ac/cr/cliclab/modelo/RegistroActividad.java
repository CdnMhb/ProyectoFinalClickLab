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
}
