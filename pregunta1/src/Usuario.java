public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private Contrasenia contrasenia;
    public Usuario(){

    }

    public Usuario(String nombre, String apellido, int edad, String dni, Contrasenia contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.contrasenia = contrasenia;
    }
    public void visualizaUsuario(){
        System.out.println(dni+"|"+nombre+"|"+apellido+"|"+edad+"|");

    }

}
