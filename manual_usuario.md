# 📘 Manual de Usuario - Sistema de Gestión de Inventarios

## 🧾 Descripción General

Este sistema permite a una empresa de distribución de alimentos gestionar su inventario en múltiples sucursales y realizar transacciones de compra y venta de productos entre sucursales y la sede central. Utiliza NetBeans, MySQL, ActiveMQ y un sistema de caché distribuido.

---

## 🚀 Requisitos del Sistema

- Java 11 o superior
- NetBeans 15 o superior
- MySQL Server (localhost:3306)
- ActiveMQ (corriendo en tcp://localhost:61616)
- Librerías necesarias:
  - `mysql-connector-java`
  - `activemq-all`
  - `log4j`, `slf4j` y sus dependencias

---

## 🏗️ Estructura del Proyecto


---

## ⚙️ Cómo Ejecutar el Proyecto

### 1. Cargar la Base de Datos
- Abrir MySQL Workbench o CLI.
- Ejecutar el archivo `gestion_inventario.sql`.

### 2. Configurar ActiveMQ
- Iniciar el servicio ActiveMQ.
- Verifica que esté corriendo en: [http://localhost:8161](http://localhost:8161)

### 3. Ejecutar desde NetBeans

#### Para enviar una transacción:
- Ejecutar `MainProductor`.

#### Para recibir y guardar la transacción:
- Ejecutar `MainConsumidor`.

#### Para probar la caché distribuida:
- Ejecutar `MainTestCache`.

---

## 📌 Notas Adicionales

- Los mensajes enviados entre sucursales y sede central están en formato:  
  `TIPO|ID_TRANSACCION|ID_SUCURSAL|ID_PRODUCTO|CANTIDAD|PRECIO_UNITARIO`

- La información recibida se guarda automáticamente en la base de datos usando JDBC.

---

## 👨‍💻 Créditos

Proyecto desarrollado por:  
**[Tu Nombre]**  
Ingeniería de Sistemas – Sistemas Transaccionales  
