package principal;
import messaging.Consumidor;

public class MainConsumidor {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor();
        consumidor.recibirMensajes("transacciones");

        System.out.println("Esperando mensajes... (presiona Ctrl + C para salir)");
        while (true) {
            // Mantener el hilo vivo para escuchar mensajes
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
