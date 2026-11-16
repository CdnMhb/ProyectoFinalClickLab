/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.cliclab.modelo;

/**
 *
 * @author jimes
 */
public class Capitulo extends Contenido {
    private int numero;
    private String objetivo;
    private String rutaImagen;
    
public Capitulo(int numero, String titulo, String objetivo) {
    super(titulo, objetivo);
    this.numero = numero;
}



    public int getNumero() { return numero; }
    public String getObjetivo() { return objetivo; }
    public String getRutaImagen() { return rutaImagen; }
}
