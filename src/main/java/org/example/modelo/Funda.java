package org.example.modelo;

import org.example.modelo.enums.*;


abstract class Funda extends AbstractProduct{
    private EnumModeloFunda modeloFunda;



    public Funda(EnumNombreProducto nombreProducto, float preciolista, float precioCosto, EnumColor color, EnumModeloFunda modeloFunda) {
        super(nombreProducto, preciolista, precioCosto, color);
        this.modeloFunda = modeloFunda;

    }


}