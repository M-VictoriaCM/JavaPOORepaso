package SeleccionDeFutbol;

import java.time.LocalDate;

public class Tecnico extends Persona{
    private int identificadorDeLaFederacion;

    public Tecnico(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, boolean estaEnElPaisDeOrigen, boolean estaConcentrando, int identificadorDeLaFederacion) {
        super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento,  estaEnElPaisDeOrigen, estaConcentrando);
        this.identificadorDeLaFederacion = identificadorDeLaFederacion;
    }

    public int getIdentificadorDeLaFederacion() {
        return identificadorDeLaFederacion;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Pasaporte: "+this.getNumeroDePasaporte();
    }
}
