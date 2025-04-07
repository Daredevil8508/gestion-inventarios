package modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaccion {
    private int id;
    private LocalDate fecha;
    private LocalTime hora;
    private int idSucursal;

    // Constructor
    public Transaccion(int id, LocalDate fecha, LocalTime hora, int idSucursal) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.idSucursal = idSucursal;
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public int getIdSucursal() {
        return idSucursal;
    }
}
