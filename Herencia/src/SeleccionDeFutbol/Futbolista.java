package SeleccionDeFutbol;

import java.time.LocalDate;

public class Futbolista extends Persona{
    private String posicion;
    private String lateralidad;
    private int cantidadDeGoles;

    public Futbolista(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, boolean estaEnElPaisDeOrigen, boolean estaConcentrando, String posicion, String lateralidad, int cantidadDeGoles) {
        super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, estaEnElPaisDeOrigen, estaConcentrando);
        this.posicion = posicion;
        this.lateralidad= lateralidad;
        this.cantidadDeGoles = cantidadDeGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getLateralidad() {
        return lateralidad;
    }

    public void setLateralidad(String lateralidad) {
        this.lateralidad = lateralidad;
    }

    public int getCantidadDeGoles() {
        return cantidadDeGoles;
    }

    public void setCantidadDeGoles(int cantidadDeGoles) {
        this.cantidadDeGoles = cantidadDeGoles;
    }
    @Override
    public String toString(){
        return super.toString()+"\n"+
                "Posicion: "+this.getPosicion()+"\n"+
                "¿Es zurdo? "+this.getLateralidad()+"\n"+
                "Cantidad de goles: "+this.getCantidadDeGoles()+"\n";
    }
}
