package org.example.modelo;
import org.example.modelo.enums.EnumColor;
import org.example.modelo.enums.EnumNombreProducto;


abstract class ProductoCarga extends AbstractProduct {
    private boolean original;
    private String marca;


    public ProductoCarga(EnumNombreProducto nombreProducto, float preciolista, float precioCosto, EnumColor color, boolean original, String marca) {
        super(nombreProducto, preciolista, precioCosto, color);
        this.original = original;
        this.marca = marca;
    }
}