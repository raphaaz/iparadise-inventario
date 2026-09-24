package org.example.modelo;
import org.example.modelo.enums.EnumColor;
import org.example.modelo.enums.EnumNombreProducto;



abstract class AbstractProduct{
    private EnumNombreProducto nombreProducto;
    //seria el precio normal-precio comun
    private float preciolista;
    private float precioCosto;
    private EnumColor color;

    private Iparadise iparadise;


    public AbstractProduct(EnumNombreProducto nombreProducto, float preciolista, float precioCosto, EnumColor color) {
        this.nombreProducto = nombreProducto;
        this.preciolista = preciolista;
        this.precioCosto = precioCosto;
        this.color = color;
    }



    public float getPreciolista() {return preciolista;}

    public float getPrecioCosto() {return precioCosto;}

    public EnumColor getColor() {return color;}

    public EnumNombreProducto getNombreProducto() {return nombreProducto;}
}