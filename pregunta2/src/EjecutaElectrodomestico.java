public class EjecutaElectrodomestico {
    public static void main(String[] args){

        Electrodomestico e1= new Electrodomestico("Lavadora","101",158,"negro",'A',50);
        Electrodomestico e2= new Electrodomestico("Televisor","102",159,"blanco",'F',25);
        Electrodomestico e3= new Electrodomestico("General","103",160,"azul",'B',10);
        e1.obtenerId();
        e2.obtenerId();
        e3.obtenerId();

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }

}
