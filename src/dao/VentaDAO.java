package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Venta;
import conexion.Conexion;

public class VentaDAO {

    public void insertarVenta(Venta v) {
        String sql = "INSERT INTO ventas (id_transaccion, id_producto, cantidad, precio_unitario) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, v.getIdTransaccion());
            stmt.setInt(2, v.getIdProducto());
            stmt.setInt(3, v.getCantidad());
            stmt.setDouble(4, v.getPrecioUnitario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error en VentaDAO: " + e.getMessage());
        }
    }
}
