package Alquileres;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alquiler {
    private LocalDate fechaDelAlquiler;
    private LocalDate fechaDevolucion;
    private List<Item>items;
    private List<Cliente>clientes;

    public Alquiler(LocalDate fechaDelAlquiler, LocalDate fechaDevolucion) {
        this.fechaDelAlquiler = fechaDelAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.items = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public LocalDate getFechaDelAlquiler() {
        return fechaDelAlquiler;
    }

    public void setFechaDelAlquiler(LocalDate fechaDelAlquiler) {
        this.fechaDelAlquiler = fechaDelAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    public boolean alquilerVencido(LocalDate fecha){
        return this.getFechaDevolucion().isBefore(fecha);
    }

    public void addAlquiler(Item items, Cliente cliente){
        if(items.estaDisponible()){
            this.items.add(items);
            items.alquilar();
            cliente.addItemsAlquilados(items);
        }
    }

    public void devolucion(Item items, Cliente cliente, LocalDate fechaHoy){
        if(!alquilerVencido(fechaHoy)){
            items.devolver();
            cliente.alquileresDevueltos(items);
            items.estaDisponible();
        }else{
            cliente.addAlquileresVencidos(items);
        }
    }
    public void alquilerVencido(Item items, Cliente cliente, LocalDate hoy){
        if(alquilerVencido(hoy)){
            cliente.addAlquileresVencidos(items);
        }
    }
    public boolean alquilerDisponible(Item item){
        return item.estaDisponible();
    }
}
