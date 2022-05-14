public class Contrasenia {
    private int longitud;
    private String clave;
    public Contrasenia(){

    }
    public Contrasenia(int longitud){
        this.longitud=longitud;
        this.clave=generarClave();


    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String generarClave(){
        StringBuilder cadcambiante;
        String alfanumero="ABCDEFGHIJKLMNÑOPQRSTUVWXYZabcdefghijklmnñopqrstuvwxyz"+"0123456789";
        cadcambiante=new StringBuilder(longitud);
        for(int j=0;j<longitud;j++){
            int indicador=(int)(alfanumero.length()*Math.random());
            cadcambiante.append(alfanumero.charAt(indicador));
        }
        return cadcambiante.toString();


    }
    public void visualizaTodo(){
        System.out.println("Contrasenia{ longitud="+longitud+" clave="+clave+"}.");
    }
}
