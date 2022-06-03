import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Impresora impresoraQueNoSeApaga = new Impresora();
        Documento documentoOfimatico;
        String nombre;
        int tamano;

        boolean salir = false;

        while (!salir) {

            Scanner scan = new Scanner(System.in);

            System.out.println("¿Que desea hacer?");
            System.out.println("1 --> Encender impresora");
            System.out.println("2 --> Apagar impresora");
            System.out.println("3 --> Añadir un trabajo");
            System.out.println("4 --> Ver lista de trabajos");
            System.out.println("5 --> Imprimir");
            System.out.println("q --> Salir");

            String opcion = scan.next();

            switch (opcion) {

                case "1":

                    break;

                case "2":

                    break;

                case "3":
                    System.out.print("Nombre del documento: ");
                    nombre = scan.nextLine();
                    System.out.print("Tamano del documento: ");
                    tamano = scan.nextInt();
                    documentoOfimatico = new Documento(nombre, tamano);
                    impresoraQueNoSeApaga.anadirDoc(documentoOfimatico);
                    break;

                case "4":
                    System.out.println(impresoraQueNoSeApaga);

                    break;

                case "5":

                    break;

                case "q":
                    salir = true;
                    break;
            }
        }
    }
}
