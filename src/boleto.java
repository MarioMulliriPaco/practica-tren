public class boleto {
    tren tren;
    Trayecto trayecto;
    tramo tramo;
    Integer numeroVagon;
    Integer fila;
    Character posicion;
    public boleto(){
    }
    public boleto(tren tren, Trayecto trayecto, tramo tramo, Integer numeroVagon, Integer fila, Character posicion){
        this.tren = tren;
        this.trayecto = trayecto;
        this.tramo = tramo;
        this.numeroVagon = numeroVagon;
        this.fila = fila;
        this.posicion = posicion;
    }
}
