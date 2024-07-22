package AlarmaSensorial;

public class AlarmaLuminosa extends Alarma{
    private Luz luz;
    public AlarmaLuminosa(Timbre sonar, Luz luz) {
        super(sonar);
        this.luz= luz;
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
