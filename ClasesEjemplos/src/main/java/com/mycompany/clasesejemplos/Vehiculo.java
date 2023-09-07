/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesejemplos;

/**
 *
 * @author PREDATOR
 */
public class Vehiculo {
    String marca;
    int modelo;
    String TipoVehiculo;
    String linea;
    String combustible;
    String motor;
    int kmPorGalon;
    int numeroSillones;
    String placa;
    String tapiceria;
    
    public Vehiculo(){
    
    }
    
    public Vehiculo(String placa, String marca){
        this.placa = placa;
        this.marca = marca;
    }
    
    public Vehiculo(String TipoVehiculo){
        this.TipoVehiculo = TipoVehiculo;
    }
    
    public Vehiculo(String combustible, int kmPorGalon){
        this.combustible = combustible;
        this.kmPorGalon = kmPorGalon;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getKmPorGalon() {
        return kmPorGalon;
    }

    public void setKmPorGalon(int kmPorGalon) {
        this.kmPorGalon = kmPorGalon;
    }

    public int getNumeroSillones() {
        return numeroSillones;
    }

    public void setNumeroSillones(int numeroSillones) {
        this.numeroSillones = numeroSillones;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String gettapiceria(){
        return tapiceria;
    }
    
    public void settapiceria(String tapiceria){
        this.tapiceria = tapiceria;
    }

    /*
    Calcular rendimiento
    */
    
 
public double kilometrosCombustible(int galones){
    double rendimiento = galones * this.getKmPorGalon();
    return rendimiento;
}
}
