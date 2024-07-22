package Avicola;

import java.time.LocalDate;

public class CongeladosPorNitrogeno extends Congelado{
    private double exposicionAlNitrogeno;

    public CongeladosPorNitrogeno(LocalDate fechaDeVencimiento, int lote, int codigoDelOrganismo, int temperaturaDeMantenimientoRecomendad, double exposicionAlNitrogeno) {
        super(fechaDeVencimiento, lote, codigoDelOrganismo, temperaturaDeMantenimientoRecomendad);
        this.exposicionAlNitrogeno = exposicionAlNitrogeno;
    }

    public double getExposicionAlNitrogeno() {
        return exposicionAlNitrogeno;
    }

    public void setExposicionAlNitrogeno(double exposicionAlNitrogeno) {
        this.exposicionAlNitrogeno = exposicionAlNitrogeno;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Metodo de congelacion: Por Nitrogeno "+"\n"+
                "Exposicion: "+this.getExposicionAlNitrogeno()+"seg.";
    }
}
