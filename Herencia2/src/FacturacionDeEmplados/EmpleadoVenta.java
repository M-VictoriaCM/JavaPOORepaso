package FacturacionDeEmplados;

public class EmpleadoVenta extends Empleado{
    private double ventasMensuales;
    private double porcentajeVentas;

    public EmpleadoVenta(String nombre, String apellido, int dni, double sueldoMensual, double ventasMensuales, double porcentajeVentas) {
        super(nombre, apellido, dni, sueldoMensual);
        this.ventasMensuales = ventasMensuales;
        this.porcentajeVentas = porcentajeVentas;
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
    public double getSueldoMensual() {
        return super.getSueldoMensual()+extraPorVentas();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
