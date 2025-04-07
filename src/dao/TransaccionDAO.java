package dao;

import java.sql.*;
import modelos.Transaccion;
import conexion.Conexion;

public class TransaccionDAO {

    public void insertarTransaccion(Transaccion t) {
        String sql = "INSERT INTO transacciones (id, fecha, hora, id_sucursal) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, t.getId());
            stmt.setDate(2, Date.valueOf(t.getFecha()));
            stmt.setTime(3, Time.valueOf(t.getHora()));
            stmt.setInt(4, t.getIdSucursal());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error en TransaccionDAO: " + e.getMessage());
        }
    }
}
