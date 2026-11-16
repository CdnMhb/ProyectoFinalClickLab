/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

/**
 *
 * @author jimes
 */
public class RegistroResultados {
    // [capitulo][actividad]: 0 = sin responder, 1 = correcta, 2 = incorrecta
    private int[][] estado;

    public RegistroResultados(int capitulos, int actividadesPorCapitulo) {
        this.estado = new int[capitulos][actividadesPorCapitulo];
    }

    public boolean registrar(int cap, int act, boolean correcta) {
        if (estado[cap][act] != 0) {
            return false;          // ya estaba respondida: no se cuenta dos veces
        }
        estado[cap][act] = correcta ? 1 : 2;
        return true;
    }

    public int getAciertos(int cap) {
        int total = 0;
        for (int j = 0; j < estado[cap].length; j++) {
            if (estado[cap][j] == 1) {
                total++;
            }
        }
        return total;
    }

    public int[] getAciertosPorCapitulo() {   // el arreglo unidimensional
        int[] aciertos = new int[estado.length];
        for (int i = 0; i < estado.length; i++) {
            aciertos[i] = getAciertos(i);
        }
        return aciertos;
    }

    public void reiniciar() {
        for (int i = 0; i < estado.length; i++) {
            for (int j = 0; j < estado[i].length; j++) {
                estado[i][j] = 0;
            }
        }
    }
}