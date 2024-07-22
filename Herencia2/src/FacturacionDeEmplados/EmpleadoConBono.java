package FacturacionDeEmplados;

public class EmpleadoConBono extends Empleado{
    private int ventasRealizadas;
    private int ventasMinimas;
    private double bono;

    public EmpleadoConBono(String nombre, String apellido, int dni, double sueldoMensual, int ventasRealizadas, int ventasMinimas, double bono) {
        super(nombre, apellido, dni, sueldoMensual);
        this.ventasRealizadas = ventasRealizadas;
        this.ventasMinimas = ventasMinimas;
        this.bono = bono;
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
    public double getSueldoMensual() {
        if(this.getVentasRealizadas() <= this.getVentasMinimas()){
            return super.getSueldoMensual()+this.getBono();
        }
        return super.getSueldoMensual();
    }
}
