package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Compra;
import conexion.Conexion;

public class CompraDAO {

    public void insertarCompra(Compra c) {
        String sql = "INSERT INTO compras (id_transaccion, id_producto, cantidad, precio_unitario) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, c.getIdTransaccion());
            stmt.setInt(2, c.getIdProducto());
            stmt.setInt(3, c.getCantidad());
            stmt.setDouble(4, c.getPrecioUnitario());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error en CompraDAO: " + e.getMessage());
        }
    }
}
