package modelos;

import java.time.LocalDateTime;

public class MovimientoInventario {
    private int id;
    private Producto producto;
    private Sucursal sucursal;
    private int cantidad;
    private LocalDateTime fecha;
    private String tipoMovimiento; // "ENTRADA" o "SALIDA"

    public MovimientoInventario(int id, Producto producto, Sucursal sucursal,
                                 int cantidad, LocalDateTime fecha, String tipoMovimiento) {
        this.id = id;
        this.producto = producto;
        this.sucursal = sucursal;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.tipoMovimiento = tipoMovimiento;
    }

    // Getters y Setters
}
