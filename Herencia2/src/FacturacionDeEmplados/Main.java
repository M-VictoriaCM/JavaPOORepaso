package FacturacionDeEmplados;

public class Main {
    public static void main(String[] args) {
        Empleado e1= new Empleado("Juan", "Hernandez", 27832123, 17000);
        Empleado e2= new EmpleadoVenta("Martin","Suarez", 1222244,15000.00, 100,5 );
        Empleado e3 =new EmpleadoConBono("Julian", "Mozo", 14876456,13000,60,50,1000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
