package Avicola;

import java.time.LocalDate;

public class Congelado extends Fresco{
    private int codigoDelOrganismo;
    private int temperaturaDeMantenimientoRecomendad;

    public Congelado(LocalDate fechaDeVencimiento, int lote, LocalDate fechaDeEnvasado, String granjaDeOrige, int codigoDelOrganismo, int temperaturaDeMantenimientoRecomendad) {
        super(fechaDeVencimiento, lote, fechaDeEnvasado, granjaDeOrige);
        this.codigoDelOrganismo = codigoDelOrganismo;
        this.temperaturaDeMantenimientoRecomendad = temperaturaDeMantenimientoRecomendad;
    }

    public int getCodigoDelOrganismo() {
        return codigoDelOrganismo;
    }

    public void setCodigoDelOrganismo(int codigoDelOrganismo) {
        this.codigoDelOrganismo = codigoDelOrganismo;
    }

    public int getTemperaturaDeMantenimientoRecomendad() {
        return temperaturaDeMantenimientoRecomendad;
    }

    public void setTemperaturaDeMantenimientoRecomendad(int temperaturaDeMantenimientoRecomendad) {
        this.temperaturaDeMantenimientoRecomendad = temperaturaDeMantenimientoRecomendad;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Codigo del organismo: "+this.getCodigoDelOrganismo()+"\n"+
                "Temperatura recomendada: "+this.getTemperaturaDeMantenimientoRecomendad()+"\n";
    }
}
