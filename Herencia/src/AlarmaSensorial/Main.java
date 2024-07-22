package AlarmaSensorial;

public class Main {
    public static void main(String[] args) {
        Timbre timbre = new Timbre();
        Luz luz= new Luz();

        Sensor s1 =new Sensor("s1", "zona1", "Se rompio un vidrio", true);
        Sensor s2 = new Sensor("S2", "Cocina", "Se abrio una puerta", false);
        Alarma a1= new Alarma(timbre);
        a1.addSensores(s1);
        a1.addSensores(s2);
       System.out.println(a1.comprobar());

        AlarmaLuminosa al1=new AlarmaLuminosa(timbre, luz);
        al1.addSensores(s1);
        al1.addSensores(s2);
        //System.out.println(al1.comprobar());
    }
}
