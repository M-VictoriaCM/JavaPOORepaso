package FacturacionComposite;

public class MontoFijo extends CalcularSueldo{
    private double monto;

    public MontoFijo(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public double calcular(Empleado empleado) {
        return getMonto();
    }
}
