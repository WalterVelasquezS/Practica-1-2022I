public class EjecutaContrasenia {

    public static void main(String[] args){
        Contrasenia c1=new Contrasenia(10);
        Contrasenia c2=new Contrasenia(10);
        Contrasenia c3=new Contrasenia(10);
        Contrasenia c4=new Contrasenia(10);
        Contrasenia c5=new Contrasenia(10);
        Contrasenia c6=new Contrasenia(10);
        Usuario u1= new Usuario("Walter","Velasquez",18,"71167531",c1);
        Usuario u2= new Usuario("Jose","espinoza",18,"71167532",c2);
        Usuario u3= new Usuario("Hugo","cuadros",18,"71167533",c3);
        Usuario u4= new Usuario("VICTOR","figueroa",18,"7116754",c4);
        Usuario u5= new Usuario("fidel","cordova",18,"71167535",c5);
        Usuario u6= new Usuario("alex","gonzales",18,"71167536",c6);
        u1.visualizaUsuario();
        u2.visualizaUsuario();
        u3.visualizaUsuario();
        u4.visualizaUsuario();
        u5.visualizaUsuario();
        u6.visualizaUsuario();
        c1.visualizaTodo();
        c2.visualizaTodo();
        c3.visualizaTodo();
        c4.visualizaTodo();
        c5.visualizaTodo();
        c6.visualizaTodo();


    }



}
