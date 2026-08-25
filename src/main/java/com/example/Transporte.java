package com.example;

public class Transporte {

    // Atributos privados
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    // CONSTRUCTOR 
    public Transporte(String idTransporte, double combustible, double capacidadCarga){
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }


    // GETTERS Y SETTERS
    public String getIdTransporte(){
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte){
        this.idTransporte = idTransporte;
    }

    public double getCombustible(){
        return combustible;
    }

    public void setCombustible(double nivel){
        if (nivel < 0)
        {
            this.combustible = 0;
        }
        else if (nivel > 100)
        {
            this.combustible = 100;
        }
        else 
        {
            this.combustible = nivel;
        }
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(double carga){
        if (carga < 0)
        {
            System.out.println("Error: La capacidad de carga no puede ser negativa.");
        }
        else 
        {
            this.capacidadCarga = carga;
        }
    }

    public void viajar(int distancia){
        double consumo = distancia / 10.0;
        if (this.combustible >= consumo)
        {
            this.combustible -= consumo;
            System.out.println("El transporte " + idTransporte + " viajo " + distancia + " km. Combustible restante: " + this.combustible);
        }
        else 
        {
            System.out.println("No hay suficiente combustible en " + idTransporte + " para viajar " + distancia + " km.");
        }
    }
}
