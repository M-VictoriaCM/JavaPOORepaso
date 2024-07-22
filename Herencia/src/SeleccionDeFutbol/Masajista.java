package SeleccionDeFutbol;

import java.time.LocalDate;

public class Masajista extends Persona{
    private String titulo;
    private int experiencia;

    public Masajista(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, boolean estaEnElPaisDeOrigen, boolean estaConcentrando, String titulo, int experiencia) {
        super(nombre, apellido, numeroDePasaporte, fechaDeNacimiento, estaEnElPaisDeOrigen, estaConcentrando);
        this.titulo = titulo;
        this.experiencia = experiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
