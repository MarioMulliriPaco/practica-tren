public class Man {
    public static void main(String[]args){
        //locomotoras
        Locomotora loc509;
        loc509 = new Locomotora (509);
        Locomotora loc566 = new Locomotora (566);
        Locomotora loc666;
        loc666 = new Locomotora();
        loc666.codigo = 666;
        //vagones
        vagon vagon1;
        vagon1 = new vagon("2 pisos", 80);
        vagon vagon2;
        vagon2 = new vagon("1 piso", 40);
        vagon vagon3;
        vagon3 = new vagon("2 pisos", 80);
        //tren509
        tren tren509 = new tren(509);
        loc509.tren = tren509;
        vagon1.tren = tren509;
        vagon2.tren = tren509;
        //tren666
        tren tren666 = new tren(666);
        loc666.tren = tren666;
        vagon3.tren = tren666;
        System.out.println(tren509);
        System.out.println(tren666);
    }
}
