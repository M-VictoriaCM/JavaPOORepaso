package FacturacionComposite;

public class Bono extends CalcularSueldo{
    private int ventasRealizadas;
    private int ventasMinimas;
    private double bono;
    private MontoFijo montoFijo;

    public Bono(int ventasRealizadas, int ventasMinimas, double bono, MontoFijo montoFijo) {
        this.ventasRealizadas = ventasRealizadas;
        this.ventasMinimas = ventasMinimas;
        this.bono = bono;
        this.montoFijo= montoFijo;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public int getVentasMinimas() {
        return ventasMinimas;
    }

    public void setVentasMinimas(int ventasMinimas) {
        this.ventasMinimas = ventasMinimas;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcular(Empleado empleado) {
        if(this.getVentasRealizadas() >= this.getVentasMinimas()){
            return montoFijo.getMonto()+this.getBono();
        }
        return montoFijo.getMonto();
    }
}
