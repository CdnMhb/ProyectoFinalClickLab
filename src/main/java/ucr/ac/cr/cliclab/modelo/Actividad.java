/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

/**
 *
 * @author mathi
 */
public abstract class Actividad extends Contenido implements Evaluable {
    private String enunciado;
    private int puntos;
    private int numeroCapitulo;

    public Actividad(String titulo, String explicacion, String enunciado,
                     int puntos, int numeroCapitulo) {
        super(titulo, explicacion);   // descripcion = explicación de la respuesta
        this.enunciado = enunciado;
        this.puntos = puntos;
        this.numeroCapitulo = numeroCapitulo;
    }

    public String getEnunciado() { return enunciado; }
    public int getNumeroCapitulo() { return numeroCapitulo; }
    public int getPuntaje() { return puntos; }

    // Cada hija decide qué opciones muestra
    public abstract String[] getOpciones();
}
