package Alquileres;

import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Blockbusters miBlockbuster = new Blockbusters("Blockbusters");

        //Creacion de las peliculas
        Pelicula p1 = new Pelicula("Matrix", 1999, 3, "Acción");
        Pelicula p2 = new Pelicula("Titanic", 1997, 2, "Drama");
        Vehiculo v1 = new Vehiculo("Toyota", 5000, "ABC123", "Naftero");
        Vehiculo v2=new Vehiculo("Tesla", 1500, "XYZ768", "Electrico");
        //Añado los item al Blockbuster
        miBlockbuster.addItems(p1);
        miBlockbuster.addItems(p2);
        miBlockbuster.addItems(v1);
        miBlockbuster.addItems(v2);
        //Creacion del cliente
        Cliente c1= new Cliente("Juan", "Perez");

        //Mostrar disponibles
        System.out.println("items para alquilar");
        for(Alquiler a: miBlockbuster.getDisponibles()){
            System.out.println(a);
        }
        List<Item> itemsAlquilados = new ArrayList<>();
        itemsAlquilados.add(p1);
        itemsAlquilados.add(v1);

        LocalDate fechaDevolucion = LocalDate.now().plusDays(7);
        miBlockbuster.crear(c1, fechaDevolucion,p1);
        miBlockbuster.crear(c1, fechaDevolucion, v1);

        System.out.println("Items alquilados: "+"\n");
        for(Item item: itemsAlquilados){
            if(!item.estaDisponible()){
                System.out.println(item);
            }
        }
        //Simulo devolucion despues de 8 dias
        LocalDate fechaHoy = LocalDate.now().plusDays(8);
        for(Alquiler alquiler : miBlockbuster.getAlquileres()){
            for(Item item: itemsAlquilados){
                alquiler.devolucion(item, c1, fechaHoy);
            }
        }
        System.out.println("Alquileres vencidos");
        List<Cliente> clienteVencidos= miBlockbuster.getAlquilerVencido(fechaHoy);
        for(Cliente cliente: clienteVencidos){
            System.out.println(cliente);
        }

    }


}
