package org.example.models;

public class Toyota extends Auto{
    private double velocidadMaxima = 500;

    @Override
    public double getVelocidadMaxima() { //probar borrar este metodo
        //return super.getVelocidadMaxima();
        return velocidadMaxima;  //return this.velocidadMaxima;
    }

    @Override
    public void setVelocidadMaxima(double velocidadMaxima) {//probar borrar este metodo
        this.velocidadMaxima = velocidadMaxima;
    }

    public Toyota(String nroPlaca) {
        super(nroPlaca);
        //setVelocidadMaxima(140);
        //this.setVelocidadMaxima(140);
        //super.setVelocidadMaxima(140);
    }
}
