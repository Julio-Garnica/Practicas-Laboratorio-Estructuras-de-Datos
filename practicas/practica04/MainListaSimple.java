public class MainListaSimple {

    /**
     * En este método main se muestran algunos de los métodos implementados en la
     * clase ListaLigadaSimple.
     * 
     * @param args
     */
    public static void main(String[] args) {
        ListaLigadaSimple<Integer> lista = new ListaLigadaSimple<>();

        // Insertar elementos en la lista
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);

        // Imprimir los elementos de la lista
        System.out.println("Elementos de la lista:");
        System.out.println(lista);
        System.out.println();

        // Da el índice del elemento proporcionado
        System.out.println("El índice del elemento 2 es: " + lista.devolverIndiceElemento(2));
        System.out.println();

        // Busca un elemento dado y da el índice de uno de los elementos
        System.out.println("Está 3 en la lista : " + lista.buscar(3));
        System.out.println("El accedido es: " + lista.acceder(1));
        System.out.println();

        // Proporciona la longitud de la lista
        System.out.println("La longitud es: " + lista.darLongitud());
        lista.eliminar(2);

        // Imprimir los elementos de la lista
        System.out.println("Elementos de la lista:");

        System.out.println(lista);

        System.out.println();

        // Actualiza la longitud de la lista y da el índice de uno de los elementos
        System.out.println("La longitud es: " + lista.darLongitud());
        System.out.println("El accedido es: " + lista.acceder(1));
        System.out.println();

        // Proporciona un índice y trata de eliminarlo de la lista
        Integer x = 3;
        lista.eliminar(x);
        System.out.println(lista);
    }
}