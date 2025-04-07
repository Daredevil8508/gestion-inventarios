# 📘 Manual de Usuario - Sistema de Gestión de Inventarios

Este sistema permite gestionar el inventario distribuido entre múltiples sucursales y una sede central mediante transacciones de compra y venta, mensajería con ActiveMQ y almacenamiento en caché para mayor rendimiento.

---

## 🔧 Requisitos Previos

Antes de ejecutar el sistema, asegúrate de tener instalado:

- Java JDK 11 o superior
- NetBeans IDE (preferiblemente 12 o superior)
- Servidor MySQL (localhost:3306)
- Apache ActiveMQ (corriendo en `tcp://localhost:61616`)
- Git (opcional, para clonar el proyecto)
- Conectores y librerías:
  - `mysql-connector-java`
  - `activemq-client`
  - `log4j-api`, `slf4j-api`, `log4j-slf4j-impl` (logging)

---

