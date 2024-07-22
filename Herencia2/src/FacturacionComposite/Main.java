package FacturacionComposite;

public class Main {
    public static void main(String[] args) {
        CalcularSueldo c1= new MontoFijo(17000);
        MontoFijo c2 = new MontoFijo(15000.00);
        MontoFijo c3= new MontoFijo(13000);
        CalcularSueldo c4 = new Porcentaje(1000.0, 10.0, c2);
        CalcularSueldo c5 = new Bono(60, 50, 1000, c3);

        Empleado e1 = new Empleado("Juan", "Hernandez",27345765, c1);
        Empleado e2= new Empleado("Martin","Suarez", 1222244,c4);
        Empleado e3 =new Empleado("Julian", "Mozo", 14876456,c5);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
