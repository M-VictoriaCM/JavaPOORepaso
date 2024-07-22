package Avicola;

import java.time.LocalDate;

public class CongeladoPorAgua extends Congelado{
    private double litrosDeAgua;
    private double gramosDeSal;

    public CongeladoPorAgua(LocalDate fechaDeVencimiento, int lote, int codigoDelOrganismo, int temperaturaDeMantenimientoRecomendad, double litrosDeAgua, double gramosDeSal) {
        super(fechaDeVencimiento, lote, codigoDelOrganismo, temperaturaDeMantenimientoRecomendad);
        this.litrosDeAgua = litrosDeAgua;
        this.gramosDeSal = gramosDeSal;
    }

    public double getLitrosDeAgua() {
        return litrosDeAgua;
    }

    public void setLitrosDeAgua(double litrosDeAgua) {
        this.litrosDeAgua = litrosDeAgua;
    }

    public double getGramosDeSal() {
        return gramosDeSal;
    }

    public void setGramosDeSal(double gramosDeSal) {
        this.gramosDeSal = gramosDeSal;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Salinidad del agua: "+"\n"+
                "Litros de agua: "+ this.getLitrosDeAgua()+"\n"+
                "Gramos de sal: "+this.getGramosDeSal();
    }
}
