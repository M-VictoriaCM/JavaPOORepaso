package CongresoDeCs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comite comite = new Comite();

        //Evaluadores
        Evaluador e1 = new Evaluador("Alice");
        Evaluador e2 = new Evaluador("Bob");
        Evaluador e3 = new Evaluador("Charlie");

        //Lista de conocimientos
        e1.addConocimiento("Algoritmo");
        e1.tieneConocimiento("Lenguaje de programacion");
        e2.addConocimiento("Agentes");
        e2.addConocimiento("Visualizacion");
        e3.addConocimiento("Redes de comunicaciones");
        e3.addConocimiento("Visualizacion");

        //Agrego el evaluador al comite
        comite.addEvaluadores(e1);
        comite.addEvaluadores(e2);
        comite.addEvaluadores(e3);

        //Crear trabajos
        Trabajo t1 = new Trabajo("Articulo");
        Trabajo t2 = new Trabajo("Resumen");
        Trabajo t3 = new Trabajo("Poster");
        Trabajo t4 = new Trabajo("Poster");
        Trabajo t6 = new Trabajo("Articulo");

        //Agreso palabras claves
        t1.addPalabrasClaves("Algoritmo");
        t1.addPalabrasClaves("Lenguajes de programacion");
        t2.addPalabrasClaves("Agentes");
        t2.addPalabrasClaves("Visualizacion");
        t3.addPalabrasClaves("Redes de comunicaciones");
        t4.addPalabrasClaves("Biologia");
        t6.addPalabrasClaves("Algoritmo");
        t6.addPalabrasClaves("Lenguajes de programacion");

        //Determino si se puede asignarse a cada trabajo
        System.out.println(e1.esApto(t1));
        System.out.println(e1.esApto(t6));
        System.out.println(e2.esApto(t2));
        System.out.println(e3.esApto(t3));
        System.out.println(e1.esApto(t4));

        System.out.println("cantidad de trabajos: "+ comite.cantidadDetrabajos(e1));
        System.out.println("cantidad de trabajos: "+ comite.cantidadDetrabajos(e2));
        System.out.println("cantidad de trabajos: "+ comite.cantidadDetrabajos(e3));
    }
}
