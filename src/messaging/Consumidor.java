package messaging;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumidor {
    public void recibirMensajes(String cola) {
        try {
            ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            Connection conexion = factory.createConnection();
            conexion.start();

            Session sesion = conexion.createSession(false, Session.AUTO_ACKNOWLEDGE);
            Destination destino = sesion.createQueue(cola);
            MessageConsumer consumidor = sesion.createConsumer(destino);

            consumidor.setMessageListener(mensaje -> {
                if (mensaje instanceof TextMessage) {
                    try {
                        String texto = ((TextMessage) mensaje).getText();
                        System.out.println("Mensaje recibido: " + texto);
                        // Aquí puedes llamar al DAO para guardar la transacción en MySQL
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
