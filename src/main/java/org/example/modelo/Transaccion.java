package org.example.modelo;


import org.example.modelo.enums.*;

import java.time.LocalDate;
import java.time.LocalTime;

abstract class Transaccion{
    private int idTransaccion;
    private LocalDate fecha;
    private LocalTime hora;
    private float monto;
    private EnumTipoTransaccion tipoTransaccion;
    private EnumEstadoTransaccion estadoTransaccion;

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }

    public EnumTipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public EnumEstadoTransaccion getEstadoTransaccion() {
        return estadoTransaccion;
    }
}