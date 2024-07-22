package PilaDeElementos;

import SombreroSeleccionador.CasaEnemiga;
import SombreroSeleccionador.CasaLinajePuro;

import javax.swing.text.Element;

public class Main {
    public static void main(String[] args) {
        PilaDeElemento p = new PilaDeElemento();
        p.push("Elemento1");
        p.push("Elemento2");
        p.push("Elemento3");
        p.push("Elemento4");
        p.push("Elemento5");

        System.out.println(p.size());
        System.out.println(p.estaVacia());
        System.out.println("El tope es: "+p.top());
        System.out.println("Elimino el ultimo agregado: "+p.pop());
        System.out.println("Pila: "+p.toString());
        System.out.println("original: "+p.toString());
        System.out.println("copia: "+p.copy());
        System.out.println("Reverse: " +p.reverse());



    }
}
