public class Usuario extends Persona {
    public String correo;
    public String contraseña;
    public Usuario(String nombre, int edad, String sexo, String correo, String contraseña) {
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contraseña = contraseña;

    }

    public void informacionusuario (){
        System.out.println("nombre : "+ nombre);
        System.out.println("edad: "+ edad);
        System.out.println("sexo: "+ sexo);
        System.out.println("correo: "+ correo);
        System.out.println("contraseña: "+ contraseña);
    }
    
}