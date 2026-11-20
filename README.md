# ClicLab

Aplicación de escritorio en **Java Swing** para aprender fotografía de forma interactiva. Cada capítulo explica un concepto con teoría y ejemplos, y después lo pone a prueba con actividades que dan retroalimentación al instante.

## Descripción

ClicLab es nuestro proyecto final, hecho con Apache NetBeans, Maven y el patrón MVC. La persona usuaria pasa por cinco capítulos sobre los ajustes básicos de una cámara, resuelve actividades de práctica y revisa cómo le fue en una pantalla de resultados.

## Público meta

Personas principiantes en la fotografía que quieren entender cómo funcionan el ISO, la velocidad, la apertura, la profundidad de campo y la distancia focal, sin necesidad de conocimientos previos.

## Integrantes

- **Mathias Hidalgo** (CdnMhb) — <https://github.com/CdnMhb>
- **Jimena Saenz** (MenaBel19) — <https://github.com/MenaBel19>
- **Naomy Delgado** (naonzzz) — <https://github.com/naonzzz>

Universidad de Costa Rica · 2026

## Requisitos

- [JDK 21](https://adoptium.net/) o superior
- [Apache NetBeans](https://netbeans.apache.org/) (incluye Maven, no hace falta instalarlo aparte)
- [Git](https://git-scm.com/download/win) para clonar el repositorio desde la terminal de Windows (es opcional si se descarga el ZIP)
- Conexión a internet la primera vez, para que NetBeans descargue las dependencias

## Instalación y ejecución

1. Descargar el proyecto de una de estas dos formas:
   - Desde **Windows PowerShell** o el símbolo del sistema:
     ```powershell
     git clone https://github.com/CdnMhb/ProyectoFinalClickLab.git
     ```
   - O desde GitHub: **Code → Download ZIP** y descomprimir la carpeta.
2. Abrir **Apache NetBeans**, ir a **File → Open Project** y elegir la carpeta del proyecto.
3. Esperar a que NetBeans termine de descargar las dependencias de Maven.
4. Hacer clic derecho sobre el proyecto y elegir **Run**, o abrir `ClicLab.java` y presionar `Shift + F6`.

La clase principal es `ucr.ac.cr.cliclab.ClicLab`.

## Funciones disponibles

- **Portada y menú de capítulos**, desde donde se entra a los cinco capítulos y a los resultados.
- **Navegación entre capítulos**: barra de progreso ("Capítulo X de 5") y botones para pasar al capítulo anterior o al siguiente sin volver al menú.
- **Teoría por capítulo**: ISO, velocidad de obturación, apertura, profundidad de campo y distancia focal.
- **Actividades de práctica** (15 en total, 3 por capítulo, 10 puntos cada una) de dos tipos: selección única y verdadero o falso.
- **Temporizador**: cada intento de actividades de un capítulo tiene 60 segundos. Si se acaba el tiempo, la app avisa y pasa a la pantalla de resultados.
- **Retroalimentación inmediata**: dice si la respuesta fue correcta y explica por qué.
- **Pantalla de resultados**: aciertos y errores por capítulo, total respondidas y porcentaje de desempeño.
- **Nuevo intento**: borra los resultados anteriores para volver a empezar.

**Limitaciones actuales**

Creemos que no hay, ya que sentimos que logramos todo lo que nos propusimos y no le hace falta nada necesario.

## Estructura general

```
ProyectoFinalClickLab/
├── pom.xml
├── lib/                         # repositorio local de AbsoluteLayout
└── src/main/
    ├── java/ucr/ac/cr/cliclab/
    │   ├── ClicLab.java         # punto de entrada
    │   ├── modelo/              # lógica y datos
    │   ├── vista/               # ventanas y paneles Swing (.java + .form)
    │   └── controlador/         # coordinan modelo y vista
    └── resources/imagenes/      # imágenes de la interfaz
```

El proyecto está organizado con el patrón **Modelo-Vista-Controlador (MVC)**:

- **Modelo:** `Contenido`, `Capitulo`, `Actividad` (abstracta, implementa `Evaluable`), `ActividadSeleccionUnica`, `ActividadVerdaderoFalso`, `TemporizadorEvaluacion` (hilo que cuenta el tiempo), `RegistroCapitulo`, `RegistroActividad` y `RegistroResultados`.
- **Vista:** `FrmMain` (portada), `VentanaMenu`, `VentanaCapitulo` con `PanelCap1`–`PanelCap5`, `VentanaActividad` y `VentanaResultados`.
- **Controlador:** `ControladorMain`, `ControladorMenuLibro`, `ControladorCapitulo`, `ControladorActividad` y `ControladorResultados`.

## Tecnologías

Java 21 · Java Swing · Maven · AbsoluteLayout (librería de NetBeans)

## Documentación

- Repositorio: <https://github.com/CdnMhb/ProyectoFinalClickLab>
- Documentación y demostración: <https://drive.google.com/drive/folders/1lj3eXgkA8mjcNkz2cosy3I5WN_YkXKtY?usp=sharing>
