package Alarma;

public class AlarmaLuminosa extends Alarma{
    private Luz luz;


    public AlarmaLuminosa(boolean seRompioUnVidrio, boolean seAbrioUnaAbertura, boolean seDetectoMovimiento, Luz luz) {
        super(seRompioUnVidrio, seAbrioUnaAbertura, seDetectoMovimiento);
        this.luz = luz;
    }

    public AlarmaLuminosa(boolean seRompioUnVidrio, boolean seAbrioUnaAbertura, boolean seDetectoMovimiento, Timbre sonar, Luz luz) {
        super(seRompioUnVidrio, seAbrioUnaAbertura, seDetectoMovimiento, sonar);
        this.luz = luz;
    }

    @Override
    public boolean comprobar() {
        if(super.comprobar()){
            this.luz.encender();
            return true;
        }
        return false;
    }
}
