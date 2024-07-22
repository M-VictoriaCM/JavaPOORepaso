package SistemaDeGastoPublico;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private List<Contribuyente>constribuyentes;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.constribuyentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addContribuyentes(Contribuyente nuevo){
        constribuyentes.add(nuevo);
    }
    public String toString(){
        return "Ciudad"+"\n"+
                "Nombre"+this.getNombre()+"\n";

    }
}
