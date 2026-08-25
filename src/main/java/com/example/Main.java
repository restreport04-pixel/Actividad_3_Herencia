package com.example;

// Importar la herramienta para usar listas dinámicas
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DESAFÍO LOGITECH 2.0 ===\n");

        CamionDeReparto miCamion = new CamionDeReparto("CAM-101", 80.0, 15.0, true);
        BuqueCarga miBuque = new BuqueCarga("BUQ-202", 90.0, 5000.0, 50);
            

        System.out.println("--- PRUEBA DE VALIDACIÓN EN SETTERS ---");
        System.out.println("Intentando asignar combustible negativo (-20) al camión...");
        miCamion.setCombustible(-20);

        System.out.println("Combustible del camión registrado: " + miCamion.getCombustible()); 
        System.out.println("---------------------------------------\n");

        miCamion.setCombustible(80.0);

        System.out.println("--- INICIANDO DEMOSTRACIÓN DE POLIMORFISMO ---");

        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(miCamion);
        flota.add(miBuque);

        for (Transporte t : flota) 
            {
                t.viajar(100); 
            }
        System.out.println("----------------------------------------------\n");

        miBuque.mostrarDatos();
        miBuque.atracarEnPuerto();
    }
}