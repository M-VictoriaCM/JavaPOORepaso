package Avicola;

import java.time.LocalDate;

public class CongeladoPorAire extends Congelado{
    private double nitrogeno;
    private double oxigeno;
    private double dioxidoDeCarbono;
    private double vaporDeAgua;

    public CongeladoPorAire(LocalDate fechaDeVencimiento, int lote, int codigoDelOrganismo, int temperaturaDeMantenimientoRecomendad, double nitrogeno, double oxigeno, double dioxidoDeCarbono, double vaporDeAgua) {
        super(fechaDeVencimiento, lote, codigoDelOrganismo, temperaturaDeMantenimientoRecomendad);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidoDeCarbono = dioxidoDeCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxidoDeCarbono() {
        return dioxidoDeCarbono;
    }

    public void setDioxidoDeCarbono(double dioxidoDeCarbono) {
        this.dioxidoDeCarbono = dioxidoDeCarbono;
    }

    public double getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(double vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Informacion de la composicion del aire: "+"\n"+
                "Nitrogeno: "+this.getNitrogeno()+"%"+"\n"+
                "Oxigeno: "+this.getOxigeno()+"%"+"\n"+
                "Dioxido de carbono: "+this.getDioxidoDeCarbono()+"%"+"\n"+
                "Vapor de agua: "+this.getVaporDeAgua()+"%"+"\n";
    }
}
