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

        // ==================== CAPÍTULO 1: ISO ====================
        agregar(new ActividadSeleccionUnica("ISO 1",
                "Con abundante luz, un ISO bajo suele ser suficiente y reduce el ruido digital.",
                "Estás fotografiando un paisaje soleado. ¿Qué valor ISO conviene utilizar para obtener una imagen limpia?", 10, 1,
                new String[]{"ISO 100", "ISO 1600", "ISO 6400"},
                "ISO 100"));

        agregar(new ActividadSeleccionUnica("ISO 2",
                "Subir el ISO aumenta el brillo registrado, aunque también puede aumentar el ruido.",
                "En un interior con poca luz, tu fotografía queda demasiado oscura y no podés modificar los otros ajustes. ¿Qué cambio puede ayudar?", 10, 1,
                new String[]{"Bajar el ISO de 800 a 100", "Subir el ISO de 800 a 1600", "Mantener el ISO y apagar las luces"},
                "Subir el ISO de 800 a 1600"));

        agregar(new ActividadVerdaderoFalso("ISO 3",
                "Los valores ISO altos pueden introducir más ruido visible.",
                "Utilizar un ISO muy alto puede aumentar el ruido digital de una fotografía.", 10, 1, true));

        // ============ CAPÍTULO 2: VELOCIDAD DE OBTURACIÓN ============
        agregar(new ActividadSeleccionUnica("Velocidad 1",
                "Una velocidad rápida reduce el desenfoque causado por el movimiento.",
                "Querés congelar a una persona saltando sin que aparezca movida. ¿Qué velocidad elegirías?", 10, 2,
                new String[]{"1 segundo", "1/15 s", "1/1000 s"},
                "1/1000 s"));

        agregar(new ActividadSeleccionUnica("Velocidad 2",
                "Una exposición lenta registra el movimiento del agua a lo largo del tiempo.",
                "Querés fotografiar una cascada con efecto de agua sedosa. ¿Qué configuración es más adecuada?", 10, 2,
                new String[]{"1/1000 s", "1 segundo, con cámara estable", "1/500 s"},
                "1 segundo, con cámara estable"));

        agregar(new ActividadVerdaderoFalso("Velocidad 3",
                "1/1000 s es un intervalo mucho más corto que 1/30 s.",
                "Una velocidad de 1/1000 s deja entrar luz durante más tiempo que una velocidad de 1/30 s.", 10, 2, false));

        // ============ CAPÍTULO 3: APERTURA DEL DIAFRAGMA ============
        agregar(new ActividadSeleccionUnica("Apertura 1",
                "Un número f menor corresponde a una abertura mayor.",
                "¿Cuál de estas aperturas deja pasar más luz, manteniendo iguales las demás condiciones?", 10, 3,
                new String[]{"f/16", "f/8", "f/1.8"},
                "f/1.8"));

        agregar(new ActividadSeleccionUnica("Apertura 2",
                "Una abertura grande suele producir menor profundidad de campo.",
                "Querés hacer un retrato con el fondo desenfocado. ¿Qué apertura suele favorecer ese resultado?", 10, 3,
                new String[]{"f/1.8", "f/11", "f/16"},
                "f/1.8"));

        agregar(new ActividadVerdaderoFalso("Apertura 3",
                "Cuanto mayor es el número f, menor es la abertura relativa.",
                "En fotografía, f/16 representa una abertura más grande que f/2.8.", 10, 3, false));

        // ============ CAPÍTULO 4: PROFUNDIDAD DE CAMPO ============
        agregar(new ActividadSeleccionUnica("Profundidad 1",
                "Una profundidad de campo reducida deja nítida una zona más pequeña.",
                "En una fotografía, la persona sale nítida y el fondo muy borroso. ¿Qué tipo de profundidad de campo se observa?", 10, 4,
                new String[]{"Amplia", "Reducida", "Infinita"},
                "Reducida"));

        agregar(new ActividadSeleccionUnica("Profundidad 2",
                "La profundidad de campo amplia mantiene más zonas de la escena aceptablemente nítidas.",
                "Querés que tanto las flores cercanas como las montañas lejanas se vean enfocadas. ¿Qué resultado necesitás?", 10, 4,
                new String[]{"Profundidad de campo amplia", "Profundidad de campo reducida", "Enfoque solo en el primer plano"},
                "Profundidad de campo amplia"));

        agregar(new ActividadVerdaderoFalso("Profundidad 3",
                "Influyen, entre otros factores, la apertura, la distancia al sujeto y la distancia focal.",
                "La profundidad de campo depende únicamente del ISO de la cámara.", 10, 4, false));

        // ============== CAPÍTULO 5: DISTANCIA FOCAL ==============
        agregar(new ActividadSeleccionUnica("Focal 1",
                "Una distancia focal corta ofrece un ángulo de visión más amplio.",
                "Querés incluir un paisaje extenso en una sola fotografía desde la misma posición. ¿Qué distancia focal conviene más?", 10, 5,
                new String[]{"18 mm", "100 mm", "200 mm"},
                "18 mm"));

        agregar(new ActividadSeleccionUnica("Focal 2",
                "Una focal larga proporciona un encuadre más estrecho y mayor tamaño aparente del sujeto.",
                "Querés fotografiar un ave lejana y que ocupe más espacio en el encuadre sin acercarte. ¿Qué distancia focal elegirías?", 10, 5,
                new String[]{"18 mm", "35 mm", "200 mm"},
                "200 mm"));

        agregar(new ActividadVerdaderoFalso("Focal 3",
                "200 mm muestra un campo de visión más estrecho que 18 mm.",
                "Desde la misma posición y con el mismo tamaño de sensor, 200 mm ofrece un ángulo de visión más amplio que 18 mm.", 10, 5, false));
    }
        
        
        
        
        
}
