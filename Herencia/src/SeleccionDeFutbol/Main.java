package SeleccionDeFutbol;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Futbolista f1= new Futbolista("Lionel", "Messi", 123452,
                LocalDate.of(1988, 06, 24),true,false,"delantero", "zurdo", 500);
        System.out.println("Futbolista: "+"\n"+f1);
    }
}
