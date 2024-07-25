package Alquileres;

public class Vehiculo extends Item {
    private String marca;
    private double km;
    private String pantente;
    private String tipo;
    private boolean estadoAlquilado;

    public Vehiculo(String marca, double km, String pantente, String tipo) {
        this.marca = marca;
        this.km = km;
        this.pantente = pantente;
        this.tipo = tipo;
        this.estadoAlquilado =estadoAlquilado;
    }

    public boolean isEstadoAlquilado() {
        return this.estadoAlquilado;
    }

    public void setEstadoAlquilado(boolean estadoAlquilado) {
        this.estadoAlquilado = estadoAlquilado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getPantente() {
        return pantente;
    }

    public void setPantente(String pantente) {
        this.pantente = pantente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean alquilar() {
        if(estaDisponible()){
            this.estadoAlquilado=true;
            return true;
        }
        return false;
    }

    @Override
    public void devolver() {
        this.estadoAlquilado = false;
        estaDisponible();
    }

    @Override
    public boolean estaDisponible() {
        return !this.isEstadoAlquilado();
    }
    public String toString(){
        return "Vehiculo: "+"\n"+
                "Marca"+this.getMarca()+"\n"+
                "Km: "+this.getKm()+"\n"+
                "Patente: "+this.getPantente()+"\n"+
                "Tipo: "+this.getTipo();
    }
}
