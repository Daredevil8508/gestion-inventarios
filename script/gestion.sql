CREATE DATABASE IF NOT EXISTS gestion_inventario;

USE gestion_inventario;

CREATE TABLE sucursales (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(150),
    telefono VARCHAR(20)
);


