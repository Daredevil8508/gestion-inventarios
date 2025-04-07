# 📦 Sistema de Gestión de Inventarios Distribuido

Este proyecto implementa un sistema de gestión de inventarios en tiempo real para una empresa de distribución de alimentos con múltiples sucursales. El sistema está desarrollado en Java (NetBeans), usa MySQL como base de datos, ActiveMQ para mensajería y un sistema de caché distribuido.

---

## 🧩 Tecnologías Utilizadas

- **Java 11+**
- **NetBeans IDE**
- **MySQL**
- **Apache ActiveMQ**
- **JDBC**
- **SLF4J + Log4j2**

---

## 📂 Estructura del Proyecto


---

## ⚙️ Configuración

1. Crea la base de datos con el script en `sql/crear_tablas.sql`.
2. Ajusta la clase `conexion.Conexion` con tus credenciales MySQL.
3. Asegúrate de tener ActiveMQ corriendo en `tcp://localhost:61616`.
4. Ejecuta las clases `MainProductor`, `MainConsumidor` y `MainTestCache` desde `NetBeans`.

---

## 📖 Documentación

- 📘 [Manual de Usuario](docs/manual_usuario.md)
- 📚 [Librerías Usadas](docs/librerias_usadas.md)

---

## 🧪 Pruebas

- Puedes probar enviando mensajes de compra/venta desde `MainProductor`.
- Verifica la base de datos y los logs de `MainConsumidor`.

---

## 📬 Contacto y Soporte

Para dudas, mejoras o sugerencias, crea un Issue o contáctame en GitHub.

---

© 2025 – Proyecto académico para Sistemas Transaccionales
