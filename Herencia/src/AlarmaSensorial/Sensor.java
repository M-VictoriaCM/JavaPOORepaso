package AlarmaSensorial;

public class Sensor {
    private String nombre;
    private String zona;
    private String comportamiento;
    private boolean estaActivo;

    public Sensor(String nombre, String zona, String comportamiento, boolean estaActivo) {
        this.nombre = nombre;
        this.zona = zona;
        this.comportamiento = comportamiento;
        this.estaActivo = estaActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public void setEstaActivo(boolean estaActivo) {
        this.estaActivo = estaActivo;
    }

    public String toString(){
        return "Sensor: "+this.getNombre()+ "\n"+
                "Zona de activacion: "+ this.getZona()+"\n"+
                "Comportamiento: "+ this.getComportamiento()+"\n";
    }
}
