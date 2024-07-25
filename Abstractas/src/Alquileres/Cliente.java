package Alquileres;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private List<Item>itemsAlquilados;
    private List<Item>itemsDevueltos;
    private List<Item>alquileresVencidos;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.itemsAlquilados = new ArrayList<>();
        this.itemsDevueltos = new ArrayList<>();
        this.alquileresVencidos = new ArrayList<>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addItemsAlquilados(Item item){
        this.itemsAlquilados.add(item);
    }
    public void addAlquileresVencidos(Item item){
        this.alquileresVencidos.add(item);
    }
    public void alquileresDevueltos(Item item){
        this.itemsDevueltos.add(item);
    }

    public boolean tengaAlquileresVencidos(Alquiler alquiler) {
        return this.alquileresVencidos.contains(alquiler);
    }
    public String toString(){
        return "Cliente"+"\n"+
                "Nombre: "+this.getNombre()+"\n"+
                "Apellido: "+this.getApellido();
    }
}
