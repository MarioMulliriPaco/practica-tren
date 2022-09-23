import java.util.Date;

public class reserva {
    String locomotora;
    Date fechaEmision;
    Trayecto trayecto;
    public reserva(){
    }
    public reserva(String locomotora, Date fechaEmision, Trayecto trayecto){
        this.locomotora = locomotora;
        this.fechaEmision = fechaEmision;
        this.trayecto = trayecto;
    }
}
