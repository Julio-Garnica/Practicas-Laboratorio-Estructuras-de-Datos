public class PAlgoritmo {

    public static String imprimeArreglo(PersonaCURP[] arreglo) {
        if (arreglo == null) {
            return null;
        }
        StringBuilder representacionCadena = new StringBuilder("[");
        for (int i = 0; i < arreglo.length; i++) {
            representacionCadena.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                representacionCadena.append(", ");
            }
        }
        representacionCadena.append("]");
        return representacionCadena.toString();
    }

    public static String imprimeArreglo(String[] arreglo) {
        if (arreglo == null) {
            return null;
        }
        StringBuilder representacionCadena = new StringBuilder("[");
        for (int i = 0; i < arreglo.length; i++) {
            representacionCadena.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                representacionCadena.append(", ");
            }
        }
        representacionCadena.append("]");
        return representacionCadena.toString();
    }

    public static String[] guardarCURP(PersonaCURP[] personaCURP) {
        if (personaCURP == null) {
            return null;
        }
        String[] CURPs = new String[personaCURP.length];
        for (int i = 0; i < CURPs.length; i++) {
            CURPs[i] = personaCURP[i].calcularCURP();
        }
        return CURPs;
    }

}
