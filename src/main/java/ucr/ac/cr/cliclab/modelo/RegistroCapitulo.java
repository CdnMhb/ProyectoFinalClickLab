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
public class RegistroCapitulo {
    private ArrayList<Capitulo> capitulos;

    public RegistroCapitulo() {
        this.capitulos = new ArrayList<>();
    }

    public void agregar(Capitulo c) {
        capitulos.add(c);
    }

    public Capitulo buscar(int numero) {
        for (Capitulo c : capitulos) {
            if (c.getNumero() == numero) {
                return c;
            }
        }
        return null;     // no existe todavía
    }
}