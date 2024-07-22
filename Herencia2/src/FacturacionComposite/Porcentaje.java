package FacturacionComposite;

public class Porcentaje extends CalcularSueldo{
    private double ventasMensuales;
    private double porcentajeVentas;
    private MontoFijo montoFijo;

    public Porcentaje(double ventasMensuales, double porcentajeVentas, MontoFijo montoFijo) {
        this.ventasMensuales = ventasMensuales;
        this.porcentajeVentas = porcentajeVentas;
        this.montoFijo= montoFijo;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public double getPorcentajeVentas() {
        return porcentajeVentas;
    }

    public void setPorcentajeVentas(double porcentajeVentas) {
        this.porcentajeVentas = porcentajeVentas;
    }
    public double extraPorVentas(){
        return this.getVentasMensuales()*(this.getPorcentajeVentas()/100);
    }

    @Override
    public double calcular(Empleado empleado) {
        return montoFijo.getMonto()+extraPorVentas();
    }
}
