package CongresoDeCs;

public class Main {
    public static void main(String[] args) {
        Congreso comite = new Congreso();

        //Evaluadores
        Evaluador e1 = new Evaluador("Alice");
        Evaluador e2 = new Evaluador("Bob");
        Evaluador e3 = new Evaluador("Charlie");

        //Lista de conocimientos
        e1.addConocimiento("Algoritmo");
        e1.addConocimiento("Lenguaje de programacion");
        e2.addConocimiento("Agentes");
        e2.addConocimiento("Visualizacion");
        e3.addConocimiento("Redes de comunicaciones");

        //Crear trabajos
        Trabajo t1 = new Trabajo("Articulo");
        Trabajo t2 = new Trabajo("Resumen");
        Trabajo t3 = new Trabajo("Poster");
        Trabajo t4 = new Trabajo("Poster");
        Trabajo p1 = new Poster("Articulo");

        //Agrego el evaluador al comite
        comite.addEvaluadores(e1);
        comite.addEvaluadores(e2);
        comite.addEvaluadores(e3);

        comite.addTrabajos(t1);
        comite.addTrabajos(t2);
        comite.addTrabajos(t3);
        comite.addTrabajos(t4);
        comite.addTrabajos(p1);
        comite.addTrabajos(t1);


        //Agreso palabras claves
        t1.addPalabra("Algoritmo");
        t1.addPalabra("Lenguaje de programacion");
        t2.addPalabra("Agentes");
        t2.addPalabra("Visualizacion");
        t3.addPalabra("Redes de comunicaciones");
        t4.addPalabra("Biologia");

        p1.addPalabra("Algoritmo");

        //Determino si se puede asignarse a cada trabajo
        System.out.println(e1.esApto(t1));
        System.out.println(e1.esApto(p1));
        System.out.println(e1.esApto(t4));
        System.out.println(e2.esApto(t2));
        System.out.println(e3.esApto(t3));

        e1.addTrabajo(t1);
        e1.addTrabajo(p1);
        e1.addTrabajo(t4);
        e2.addTrabajo(t2);
        e3.addTrabajo(t3);


        System.out.println(comite.cantidadDeTrabajos(e1));
        System.out.println(comite.cantidadDeTrabajos(e2));
    }
}
