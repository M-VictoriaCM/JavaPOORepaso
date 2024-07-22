package Alarma;

public class Main {
    public static void main(String[] args) {
        Timbre timbre = new Timbre();
        Luz luz= new Luz();
        Alarma a1 = new Alarma(true, false, false,timbre);
        Alarma a2 = new Alarma(true, true, true, timbre);
        Alarma a3 = new Alarma(false, false, false, timbre);

        System.out.println("¿La alarma esta activa? "+a1.comprobar());
        System.out.println("¿La alarma esta activa? "+a2.comprobar());
        System.out.println("¿La alarma esta activa? "+a3.comprobar());

        Luz l = new Luz();
        AlarmaLuminosa al1 = new AlarmaLuminosa(true, false, false, timbre, l);
        AlarmaLuminosa al2 = new AlarmaLuminosa(false, false, false, timbre, l);
        System.out.println("¿La alarma luminosa esta activa? "+al1.comprobar());
        System.out.println("¿La alarma luminosa esta activa? "+al2.comprobar());
    }
}
