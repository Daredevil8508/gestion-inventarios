package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Producto;
import conexion.Conexion;

public class ProductoDAO {

    public void insertarProducto(Producto p) {
        String sql = "INSERT INTO productos (id, nombre, descripcion, precio) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNombre());
            stmt.setString(3, p.getDescripcion());
            stmt.setDouble(4, p.getPrecio());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error en ProductoDAO: " + e.getMessage());
        }
    }
}
