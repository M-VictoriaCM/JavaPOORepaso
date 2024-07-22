package AlarmaSensorial;

import java.util.Vector;

public class Alarma {
    private boolean seRompioUnVidrio;
    private boolean seAbrioUnaAbertura;
    private boolean seDetectoMovimiento;
    private Timbre sonar;
    private Vector<Sensor> sensores;

    public Alarma(Timbre sonar) {
        this.sonar = sonar;
        this.sensores = new Vector<>();
    }
    public boolean comprobar(){
        boolean activacion = false;
        for(Sensor s: sensores){
            if(s.isEstaActivo()){
                activacion = true;
                System.out.println(s.toString());
            }
        }
        if(activacion){
            sonar.hacerSonar();
            return true;
        }else {
            return false;
        }
    }
    public void addSensores(Sensor s){
        if(!sensores.contains(s)){
            sensores.add(s);
        }
    }

}
