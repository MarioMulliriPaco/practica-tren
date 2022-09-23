import java.util.Date;

public class tramo {
    ciudad origen;
    ciudad destino;
    Date horaSalida;
    Double duracion;
    public tramo(){
    }
    public tramo(ciudad origen, ciudad destino, Date horaSalida, Double duracion){
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.duracion = duracion;
    }
}
