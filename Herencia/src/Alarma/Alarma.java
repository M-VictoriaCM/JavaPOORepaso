package Alarma;

public class Alarma {
    private boolean seRompioUnVidrio;
    private boolean seAbrioUnaAbertura;
    private boolean seDetectoMovimiento;
    private Timbre sonar;

    public Alarma(boolean seRompioUnVidrio, boolean seAbrioUnaAbertura, boolean seDetectoMovimiento) {
        this.seRompioUnVidrio = false;
        this.seAbrioUnaAbertura = false;
        this.seDetectoMovimiento = false;
    }

    public Alarma(boolean seRompioUnVidrio, boolean seAbrioUnaAbertura, boolean seDetectoMovimiento, Timbre sonar) {
        this.seRompioUnVidrio = seRompioUnVidrio;
        this.seAbrioUnaAbertura = seAbrioUnaAbertura;
        this.seDetectoMovimiento = seDetectoMovimiento;
        this.sonar = sonar;
    }

    public boolean isSeRompioUnVidrio() {
        return seRompioUnVidrio;
    }

    public void setSeRompioUnVidrio(boolean seRompioUnVidrio) {
        this.seRompioUnVidrio = seRompioUnVidrio;
    }

    public boolean isSeAbrioUnaAbertura() {
        return seAbrioUnaAbertura;
    }

    public void setSeAbrioUnaAbertura(boolean seAbrioUnaAbertura) {
        this.seAbrioUnaAbertura = seAbrioUnaAbertura;
    }

    public boolean isSeDetectoMovimiento() {
        return seDetectoMovimiento;
    }

    public void setSeDetectoMovimiento(boolean seDetectoMovimiento) {
        this.seDetectoMovimiento = seDetectoMovimiento;
    }

    public boolean comprobar(){
        if(this.isSeAbrioUnaAbertura() || this.seRompioUnVidrio || this.isSeDetectoMovimiento()){
            sonar.hacerSonar();
            return true;
        }
        return false;
    }

}
