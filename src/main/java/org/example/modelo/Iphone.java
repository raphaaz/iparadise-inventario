package org.example.modelo;
import org.example.modelo.enums.*;

class Iphone extends AbstractProduct {
    private int modelo;
    private int imei;
    private int capacidad;
    private boolean disponible;


    public Iphone(EnumNombreProducto nombreProducto, float preciolista, float precioCosto, EnumColor color, int modelo, int imei, int capacidad, boolean disponible) {
        super(nombreProducto, preciolista, precioCosto, color);
        this.modelo = modelo;
        this.imei = imei;
        this.capacidad = capacidad;
        this.disponible = disponible;
    }


    public int getModelo() {
        return modelo;
    }
    public int getImei() {
        return imei;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public boolean isDisponible() {
        return disponible;
    }


    public void cambiarBateria(int bateria) {
        // Lógica para cambiar la batería
        if (0<bateria && bateria<=100) {

        }else {
            ;
        }
    }
}


/*funciones que puede tener un iphone:
cambiar la bateria, cambiar la pantalla, cambiar el modulo de camara, cambiar la tapa etc

* */

