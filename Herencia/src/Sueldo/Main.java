package Sueldo;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Juan", "Perez", 500);
        EmpleadoPorHora emp2 = new EmpleadoPorHora(2, "Ana", "Gomez", 300, 20, 10);
        EmpleadosPorComision emp3 = new EmpleadosPorComision(3, "Luis", "Martinez", 400, 50, 5);

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
    }
}
