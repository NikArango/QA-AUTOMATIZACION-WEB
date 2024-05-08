package org.example.models;

public class Auto {

    private String nroPlaca;
    private String marca;
    private String color;
    private String modelo;
    private int anioFabricacion;
    private double precio;
    private int nroLlantas;
    private double velocidadActual = 0;
    private double velocidadMaxima = 350;
    private double aceleracion = 20;
    private double velocidadFrenado = -10;
    private boolean bEncendido;
    private boolean bLucesEncendidas;
    private double direccionTimon;

    public Auto(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    public boolean acelerar(double velocidadFin){
        //Debe devolver true: Si puede acelerar hasta esa velocidad
        //falso: si hay un error

        if(velocidadFin <= 0){
            return false;
        }
        if(velocidadFin > velocidadMaxima){
            return false;
        }

        return true;
    }

    /* Setter && Getter */
    public String getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNroLlantas() {
        return nroLlantas;
    }

    public void setNroLlantas(int nroLlantas) {
        this.nroLlantas = nroLlantas;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public double getVelocidadFrenado() {
        return velocidadFrenado;
    }

    public void setVelocidadFrenado(double velocidadFrenado) {
        this.velocidadFrenado = velocidadFrenado;
    }

    public boolean isbEncendido() {
        return bEncendido;
    }

    public void setbEncendido(boolean bEncendido) {
        this.bEncendido = bEncendido;
    }

    public boolean isbLucesEncendidas() {
        return bLucesEncendidas;
    }

    public void setbLucesEncendidas(boolean bLucesEncendidas) {
        this.bLucesEncendidas = bLucesEncendidas;
    }

    public double getDireccionTimon() {
        return direccionTimon;
    }

    public void setDireccionTimon(double direccionTimon) {
        this.direccionTimon = direccionTimon;
    }
}
