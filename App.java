public class App extends Persona {
    public App (String nombre, int edad, String sexo) {
        super (nombre, edad, sexo);
    }
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Brandi", 20, "Masculino", "nanopineda02@gmail.com", "password123");
        usuario1.informacionusuario();
    }
}
