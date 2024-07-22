package SeleccionDeFutbol;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int numeroDePasaporte;
    private LocalDate fechaDeNacimiento;
    private boolean estaEnElPaisDeOrigen;
    private boolean estaConcentrando;

    public Persona(String nombre, String apellido, int numeroDePasaporte, LocalDate fechaDeNacimiento, boolean estaEnElPaisDeOrigen, boolean estaConcentrando) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDePasaporte = numeroDePasaporte;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estaEnElPaisDeOrigen = estaEnElPaisDeOrigen;
        this.estaConcentrando = estaConcentrando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroDePasaporte() {
        return numeroDePasaporte;
    }

    public void setNumeroDePasaporte(int numeroDePasaporte) {
        this.numeroDePasaporte = numeroDePasaporte;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isEstaEnElPaisDeOrigen() {
        return estaEnElPaisDeOrigen;
    }

    public void setEstaEnElPaisDeOrigen(boolean estaEnElPaisDeOrigen) {
        this.estaEnElPaisDeOrigen = estaEnElPaisDeOrigen;
    }

    public boolean isEstaConcentrando() {
        return estaConcentrando;
    }

    public void setEstaConcentrando(boolean estaConcentrando) {
        this.estaConcentrando = estaConcentrando;
    }

    public boolean estaDisponible(){
        if(this.isEstaEnElPaisDeOrigen() && !(this.isEstaConcentrando())){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Nombre: "+this.getNombre()+"\n"+
                "Apellido: "+this.getApellido()+"\n"+
                "pasaporte: "+this.getNumeroDePasaporte()+"\n"+
                "Fecha de Nacimiento: "+this.getFechaDeNacimiento()+"\n"+
                "¿Esta concentrado? "+ this.estaConcentrando+"\n"+
                "¿Esta en el pais de origen? "+this.isEstaEnElPaisDeOrigen()+"\n"+
                "¿Esta disponible? "+this.estaDisponible();
    }
}
