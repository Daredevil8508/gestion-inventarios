package modelos;

public class Venta {
    private int idTransaccion;
    private int idProducto;
    private int cantidad;
    private double precioUnitario;

    public Venta(int idTransaccion, int idProducto, int cantidad, double precioUnitario) {
        this.idTransaccion = idTransaccion;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
}
