package principal;
import messaging.Productor;

public class MainProductor {
    public static void main(String[] args) {
        Productor productor = new Productor();
        String mensaje = "COMPRA|1|3|5|2500"; // formato: tipo|sucursalId|productoId|cantidad|precio
        productor.enviarMensaje("transacciones", mensaje);
    }
}

