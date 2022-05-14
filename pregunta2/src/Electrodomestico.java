import java.util.Random;
public class Electrodomestico {
    public static final String TIPO_LAVADORA="Lavadora";
    public static final String TIPO_TELEVISOR="Televisor";
    public static final String TIPO_GENERAL="General";
    private String tipo;
    private String codigo;
    private float precioBase;
    private String color;
    private char consumoEnerg;
    private float peso;
    private int id;
    public Electrodomestico(){

    }
    public Electrodomestico(String tipo,String codigo,float precioBase,float peso){
        this.color="Blanco";
        this.consumoEnerg='F';

    }

    public Electrodomestico(String tipo, String codigo, float precioBase, String color, char consumoEnerg, float peso) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnerg = consumoEnerg;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getId(){
        return id;
    }
    public  void obtenerId(){
        this.id= (int) Math.round((Math.random()*(2000-1000+1)+1000));
    }
     private static void comprobarConsumoEnergetico(char letra){
        if(letra=='A'|| letra=='F' || letra=='B'|| letra=='C'|| letra=='D'|| letra=='E'){

        }
        else{
            letra='F';
        }


    }
    private static void comprobarColor(String color){
        if(color==""){
            color="blanco";
        }
    }
    public float calcularPrecioFinal() {
        float preciofinal = 0;
        switch (consumoEnerg) {
            case 1:
                consumoEnerg = 'A';
                switch ((int) peso) {
                    case 1:
                        if (peso <= 19 && peso > 0) {
                            preciofinal = precioBase + 10 + 100;
                        }
                        break;
                    case 2:
                        if (peso >= 20 && peso < 49) {
                            preciofinal = precioBase + 50 + 100;
                        }
                        break;
                    case 3:
                        if (peso >= 50 && peso < 79) {
                            preciofinal = precioBase + 80 + 100;
                        }
                        break;
                    case 4:
                        if (peso >= 80) {
                            preciofinal = precioBase + 100 + 100;
                        }
                        break;


                }
                break;
            case 2:
                consumoEnerg = 'B';
                switch ((int) peso) {
                    case 1:
                        if (peso <= 19 && peso > 0) {
                            preciofinal = precioBase + 10 + 80;
                        }
                        break;
                    case 2:
                        if (peso >= 20 && peso < 49) {
                            preciofinal = precioBase + 50 + 80;
                        }
                        break;
                    case 3:
                        if (peso >= 50 && peso < 79) {
                            preciofinal = precioBase + 80 + 80;
                        }
                        break;
                    case 4:
                        if (peso >= 80) {
                            preciofinal = precioBase + 100 + 80;
                        }
                        break;


                }
                break;
            case 3:
                consumoEnerg = 'C';
                switch ((int) peso) {
                    case 1:
                        if (peso <= 19 && peso > 0) {
                            preciofinal = precioBase + 10 + 60;
                        }
                        break;
                    case 2:
                        if (peso >= 20 && peso < 49) {
                            preciofinal = precioBase + 50 + 60;
                        }
                        break;
                    case 3:
                        if (peso >= 50 && peso < 79) {
                            preciofinal = precioBase + 80 + 60;
                        }
                        break;
                    case 4:
                        if (peso >= 80) {
                            preciofinal = precioBase + 100 + 60;
                        }
                        break;


                }
                break;
            case 4:
                consumoEnerg = 'D';
                switch ((int) peso) {
                    case 1:
                        if (peso <= 19 && peso > 0) {
                            preciofinal = precioBase + 10 + 50;
                        }
                        break;
                    case 2:
                        if (peso >= 20 && peso < 49) {
                            preciofinal = precioBase + 50 + 50;
                        }
                        break;
                    case 3:
                        if (peso >= 50 && peso < 79) {
                            preciofinal = precioBase + 80 + 50;
                        }
                        break;
                    case 4:
                        if (peso >= 80) {
                            preciofinal = precioBase + 100 + 50;
                        }
                        break;


                }
                break;
            case 5:
                consumoEnerg = 'E';
                switch ((int) peso) {
                    case 1:
                        if (peso <= 19 && peso > 0) {
                            preciofinal = precioBase + 10 + 30;
                        }
                        break;
                    case 2:
                        if (peso >= 20 && peso < 49) {
                            preciofinal = precioBase + 50 + 30;
                        }
                        break;
                    case 3:
                        if (peso >= 50 && peso < 79) {
                            preciofinal = precioBase + 80 + 30;
                        }
                        break;
                    case 4:
                        if (peso >= 80) {
                            preciofinal = precioBase + 100 + 30;
                        }
                        break;
                }
                break;
                    case 6:
                        consumoEnerg = 'F';
                        switch ((int) peso) {
                            case 1:
                                if (peso <= 19 && peso > 0) {
                                    preciofinal = precioBase + 10 + 10;
                                }
                                break;
                            case 2:
                                if (peso >= 20 && peso < 49) {
                                    preciofinal = precioBase + 50 + 10;
                                }
                                break;
                            case 3:
                                if (peso >= 50 && peso < 79) {
                                    preciofinal = precioBase + 80 + 10;
                                }
                                break;
                            case 4:
                                if (peso >= 80) {
                                    preciofinal = precioBase + 100 + 10;
                                }
                                break;
                        }
                        break;


                        }


        return preciofinal;
    }
    @Override
    public String toString(){
        return "Electrodomestico{"+
                "#"+id+"|"+tipo+"|"+precioBase+"$|"+color+"|"+peso+"gr}";
    }

    }
