package Sueldo;

public class EmpleadosPorComision extends Empleado{
    private int cantidadDeVentas;
    private double porcentaje;
    public EmpleadosPorComision(int numeroEmpleado, String nombre, String apellido, double sueldo) {
        super(numeroEmpleado, nombre, apellido, sueldo);
        this.cantidadDeVentas = cantidadDeVentas;
        this.porcentaje = porcentaje;
    }

    public EmpleadosPorComision(int numeroEmpleado, String nombre, String apellido, double sueldo, int cantidadDeVentas, double porcentaje) {
        super(numeroEmpleado, nombre, apellido, sueldo);
        this.cantidadDeVentas = cantidadDeVentas;
        this.porcentaje = porcentaje;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public double getPorcentaje() {
        return (porcentaje/100);
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    public double comision(){
        return this.getCantidadDeVentas()*this.getPorcentaje();
    }

    @Override
    public double getSueldo() {
        return super.getSueldo()+ comision();
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "Cantidad de ventas: "+this.getCantidadDeVentas()+"\n"+
                "Porcentaje: "+ this.getPorcentaje()+"\n"+
                "Comision: "+this.comision();
    }
}
