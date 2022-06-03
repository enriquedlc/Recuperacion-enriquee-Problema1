import java.util.ArrayList;

public class Impresora {

    private boolean estadoImpresora;
    private ArrayList<Documento> colaImprimir = new ArrayList<>();

    public void anadirDoc(Documento documentoOfimatico) {
        colaImprimir.add(documentoOfimatico);
    }

    public int tamanoColaImpresion() {
        int imprimir = colaImprimir.size();
        return imprimir;
    }

    public Documento imprimirDoc() {
        return colaImprimir.remove(0);
    }


    @Override
    public String toString() {
        return "Impresora{ " +
                ", colaImpresion= " + colaImprimir +
                " }";
    }
}
