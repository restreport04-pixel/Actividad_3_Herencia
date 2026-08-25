package com.example;

public class BuqueCarga extends Transporte{

    // Atributo propio
    private int cantidadContenedores;

    // CONSTRUCTOR
    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores){
        // super envía los datos obligatorios al constructor de la clase padre Transporte
        super(idTransporte, combustible, capacidadCarga); // Enviar datos al padre
        this.cantidadContenedores = cantidadContenedores;
    }

    // Getter y Setter
    public int getCantidadContenedores(){
        return cantidadContenedores;
    }

    public void setCantidadContenedores(int cantidadContenedores){
        this.cantidadContenedores = cantidadContenedores;
    }

    // MÉTODO PROPIO
    public void atacarEnPuerto(){
        System.out.println("⚓ El buque con ID: " + getIdTransporte() + " ha atracado en el puerto y esta listo para descarga.");
    }

    // MÉTODO mostrarDatos
    public void mostrarDatos(){
        // Calcular el Costo de Viaje: por ejemplo una tarifa estándar de 150 USD por cada contenedor
        double costoViaje = cantidadContenedores * 150.0;

        System.out.println("==================================================");
        System.out.println("🚢 DATOS DEL BUQUE DE CARGA - " + getIdTransporte());
        System.out.println("Combustible actual    : " + getCombustible() + "%");
        System.out.println("Capacidad de carga    : " + getCapacidadCarga() + " toneladas");
        System.out.println("Cantidad Contenedores    : " + cantidadContenedores);
        System.out.println("Costo de viaje Estudiante    : $" + costoViaje + "USD");
        System.out.println("==================================================\n");
    }
}
