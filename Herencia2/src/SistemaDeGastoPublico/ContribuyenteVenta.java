package SistemaDeGastoPublico;

public class ContribuyenteVenta extends Contribuyente{
    private double porcentaje;
    private double montoFacturado;
    private double porcentajeMontoFijo;

    public ContribuyenteVenta(int idTributario, String nombre, double impuesto, double porcentaje, double montoFacturado,double porcentajeMontoFijo) {
        super(idTributario, nombre, impuesto);
        this.porcentaje = porcentaje;
        this.montoFacturado = montoFacturado;
        this.porcentajeMontoFijo= porcentajeMontoFijo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public double getPorcentajeMontoFijo() {
        return porcentajeMontoFijo;
    }

    public void setPorcentajeMontoFijo(int porcentajeMontoFijo) {
        this.porcentajeMontoFijo = porcentajeMontoFijo;
    }
    public double montoFacturado(){
        return this.getMontoFacturado()*(this.getPorcentajeMontoFijo()/100);
    }
    @Override
    public double getImpuesto() {
        return (super.getImpuesto()*(this.getPorcentaje()/100))+montoFacturado();
    }
}
