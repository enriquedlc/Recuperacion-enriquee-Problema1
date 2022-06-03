public class Documento {

    private String nombre;
    private int tamano;

    public Documento(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamano = tamaño;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nombre='" + nombre + '\'' +
                ", tamaño=" + tamano +
                '}';
    }
}
