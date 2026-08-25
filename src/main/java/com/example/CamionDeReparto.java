package com.example;

public class CamionDeReparto extends Transporte {

    // Atributo propio
    private boolean tieneRefrigeración;

    // CONSTRUCTOR
    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeración){
        // super envía los datos obligatorios al constructor de la clase padre Transporte
        super(idTransporte, combustible, capacidadCarga); // Enviar datos al padre
        this.tieneRefrigeración = tieneRefrigeración;
    }

    // Getter y Setter 
    public boolean isTieneRefrigeracion(){
        return tieneRefrigeración;
    }

    public void setTieneRefrigeracion(boolean tieneRefrigeración){
        this.tieneRefrigeración = tieneRefrigeración;
    }

    // SOBRESCRITURA @Override Redefinir el comportamiento de viajar
    @Override
    public void viajar(int distancia){
        double consumo;
        if (tieneRefrigeración)
        {
            consumo = (distancia / 10.0)* 2;
        }
        else 
        {
            consumo = distancia / 10.0;  // Consumo normal
        }

        // Aplicar la reducción de combustible usando los getters y setters del padre

        if (getCombustible() >= consumo)
        {
            setCombustible(getCombustible() - consumo);
            System.out.println("El camion de reparto " + getIdTransporte() + " (Refrigeracion: " + tieneRefrigeración + " ) viajó " + distancia + " km. Combustible restante: " + getCombustible());
        }
        else 
        {
            System.out.println("El camion " + getIdTransporte() + " no tiene suficiente combustible para este viaje.");
        }
    }
}
