package messaging;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Productor {
    public void enviarMensaje(String cola, String mensajeTexto) {
        try {
            ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            Connection conexion = factory.createConnection();
            conexion.start();

            Session sesion = conexion.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destino = sesion.createQueue(cola);
            MessageProducer productor = sesion.createProducer(destino);
            TextMessage mensaje = sesion.createTextMessage(mensajeTexto);

            productor.send(mensaje);
            System.out.println("Mensaje enviado: " + mensajeTexto);

            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
