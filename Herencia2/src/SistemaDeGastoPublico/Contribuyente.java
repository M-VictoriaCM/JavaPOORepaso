package SistemaDeGastoPublico;

public class Contribuyente {
    private int idTributario;
    private String nombre;
    private double impuesto;

    public Contribuyente(int idTributario, String nombre, double impuesto) {
        this.idTributario = idTributario;
        this.nombre = nombre;
        this.impuesto = impuesto;
    }

    public int getIdTributario() {
        return idTributario;
    }

    public void setIdTributario(int idTributario) {
        this.idTributario = idTributario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }
    public String toString(){
        return "Contribuyente"+"\n"+
                "id: "+this.getIdTributario()+"\n"+
                "Nombre: "+this.getNombre()+"\n"+
                "Impuesto"+this.getImpuesto()+"\n";
    }
}
