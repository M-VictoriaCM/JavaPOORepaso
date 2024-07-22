package SistemaDeGastoPublico;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Ciudad> ciudades;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.ciudades= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addCiudades(Ciudad nuevo){
        ciudades.add(nuevo);
    }
    public String toString(){
        return this.getNombre()+"\n";
    }
}
