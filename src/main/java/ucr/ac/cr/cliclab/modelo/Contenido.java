/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

/**
 *
 * @author mathi
 */
public class Contenido {
     private String titulo;
    private String descripcion;

    public Contenido(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
}
