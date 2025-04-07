package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelos.Sucursal;
import conexion.Conexion;

public class SucursalDAO {

    public void insertarSucursal(Sucursal s) {
        String sql = "INSERT INTO sucursales (id, nombre, direccion, telefono) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, s.getId());
            stmt.setString(2, s.getNombre());
            stmt.setString(3, s.getDireccion());
            stmt.setString(4, s.getTelefono());

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error en SucursalDAO: " + e.getMessage());
        }
    }
}
