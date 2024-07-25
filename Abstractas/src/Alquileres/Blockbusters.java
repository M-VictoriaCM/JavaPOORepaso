package Alquileres;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Blockbusters {
    private String nombre;
    private List<Alquiler>alquileres;
    private List<Item>items;
    private List<Cliente> clientes;

    public Blockbusters(String nombre) {
        this.nombre = nombre;
        this.alquileres= new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
    }
    //¿Quienes son los clientes con los alquileres vencidos?
    public List<Cliente>getAlquilerVencido(LocalDate fecha){
        List<Cliente>aux= new ArrayList<>();
        for(Alquiler a :alquileres){
            for(Cliente c: clientes){
                if(a.alquilerVencido(fecha)){
                    aux.add(c);
                }
            }
        }
        return aux;
    }
    public void crear(Cliente cliente, LocalDate fechaDevolucion, Item i){
        LocalDate fechaAlquiler = LocalDate.now();
        Alquiler nuevo = new Alquiler(fechaAlquiler, fechaDevolucion);
            nuevo.addAlquiler(i, cliente);
    }
    public boolean tieneCliente(Cliente cliente){
        return clientes.contains(cliente);
    }
    public void addItems(Item item){
        this.items.add(item);
    }
    public void addCliente(Cliente cliente){
        if(!this.tieneCliente(cliente)) {
            this.clientes.add(cliente);
        }
    }
    public List<Alquiler>getAlquileres(){
        return this.alquileres;
    }

    public List<Alquiler>getDisponibles() {
        List<Alquiler>aux = new ArrayList<>();
        for(Alquiler alquiler: alquileres){
            for(Item item: items) {
                if (alquiler.alquilerDisponible(item)){
                    aux.add(alquiler);
                }
            }
        }
        return aux;
    }
}
