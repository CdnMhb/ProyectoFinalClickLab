
package ucr.ac.cr.cliclab.modelo;

import javax.swing.SwingUtilities;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class TemporizadorEvaluacion {

    private Thread hilo;
    private final AtomicInteger version = new AtomicInteger();

    public void iniciar(int segundos, IntConsumer actualizar,
                        Runnable tiempoAgotado) {

        detener();

        int actual = version.get();
        actualizar.accept(segundos);

        hilo = new Thread(() -> {

            for (int restante = segundos - 1;
                 restante >= 0; restante--) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    return;
                }

                int tiempo = restante;

                SwingUtilities.invokeLater(() -> {
                    if (version.get() != actual) {
                        return;
                    }

                    actualizar.accept(tiempo);

                    if (tiempo == 0) {
                        detener();
                        tiempoAgotado.run();
                    }
                });
            }
        });

        hilo.start();
    }

    public void detener() {
        version.incrementAndGet();

        if (hilo != null) {
            hilo.interrupt();
        }
    }
}
