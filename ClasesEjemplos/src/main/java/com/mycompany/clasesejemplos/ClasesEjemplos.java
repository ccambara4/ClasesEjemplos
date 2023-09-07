/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clasesejemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author PREDATOR
 */
public class ClasesEjemplos {

    public static void main(String[] args) {
        
        DecimalFormat formateador = new DecimalFormat("###,###,###");
        
        double division = (3.1416 * 100) / 2.5;
        
        System.out.println("La división es: " + formateador.format(division));
        
        Vehiculo vehiculo = new Vehiculo();
        
        Vehiculo vehiculo2 = new Vehiculo("Gasolina", 50);
        
        Scanner scanner = new Scanner(System.in);
        String marcaVh = "";
        String placaVH = "";
        int anio;
        int kms;
        int galones;
        
        System.out.println("Valor actual marca vehiculo: " + vehiculo.getMarca());
        
        System.out.println("\n Ingrese la marca del vehiculo: ");
        marcaVh = scanner.nextLine();
        
        System.out.println("Marca ingresada:" + marcaVh);
        vehiculo.setMarca(marcaVh);
        
       
        System.out.println("Vehiculo marca: " + vehiculo.getMarca());
        
        System.out.println("*****Vehiculo 1********");
        
        System.out.println("Ingrese la placa del vehiculo: ");
        placaVH = scanner.nextLine();
        
        System.out.println("Ingrese el año del vehiculo: ");
        anio = scanner.nextInt();
        
        System.out.println("Ingrese los kilometros a recorrer: ");
        kms = scanner.nextInt();
        
        System.out.println("Ingrese los galones disponibles: ");
        galones = scanner.nextInt();
        
        vehiculo2.setPlaca(placaVH);
        vehiculo2.setModelo(anio);
        
        System.out.println("Datos Vehiculos: ");
        System.out.println("Combustible: " + vehiculo2.getCombustible());
        System.out.println("Kms por galon: " + vehiculo2.getKmPorGalon());
        System.out.println("Placa: " + vehiculo2.getPlaca());
        System.out.println("Año: " + vehiculo2.getModelo());
        
        System.out.println("Con " + galones + " galones recorrera " +  vehiculo2.kilometrosCombustible(galones) + " kilometros ");
        
        System.out.println("******Vehiculo 2*********");
    }
}
