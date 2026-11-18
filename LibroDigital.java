public class LibroDigital extends Libro {
    public String formato;
    public double tamanioMB;

    public LibroDigital(String titulo, String autor, int anio, String formato, double tamanioMB) {
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Formato: " + formato);
        System.out.println("Tamanio (MB): " + tamanioMB);
    }
}