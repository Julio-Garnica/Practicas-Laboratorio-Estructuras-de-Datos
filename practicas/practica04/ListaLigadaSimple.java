import java.util.Iterator;

/**
 * Implementación de una lista enlazada simple genérica.
 *
 * @param <T> El tipo de elementos almacenados en la lista.
 */
public class ListaLigadaSimple<T> implements Lista<T> {

    private class Nodo {
        /**
         * Elemento almacenado en el nodo.
         */
        public T elemento;

        /**
         * Apuntador al siguiente nodo en la lista.
         */
        public Nodo siguiente;

        /**
         * Crea un nuevo nodo con el elemento proporcionado.
         *
         * @param elemento El elemento a almacenar en el nodo.
         */
        public Nodo(T elemento) {
            this.elemento = elemento;
        }
    }

    /**
     * Un iterador para recorrer la lista enlazada simple.
     */
    private class IteradorListaSimple implements Iterator<T> {

        /**
         * El nodo siguiente al que se moverá el iterador.
         */
        private Nodo iteradorLista;

        /**
         * Crea un nuevo iterador y lo inicializa en el primer nodo de la lista.
         */
        public IteradorListaSimple() {
            iteradorLista = new Nodo(null);
            iteradorLista.siguiente = cabeza;
        }

        /**
         * Verifica si hay un siguiente elemento en la lista.
         *
         * @return true si hay un siguiente elemento, false de lo contrario.
         */
        public boolean hasNext() {
            return iteradorLista.siguiente != null;
        }

        /**
         * Obtiene el siguiente elemento en la lista y mueve el iterador al siguiente
         * nodo.
         *
         * @return El siguiente elemento en la lista.
         */
        public T next() {
            iteradorLista = iteradorLista.siguiente;
            return iteradorLista.elemento;
        }
    }

    private Nodo cabeza;

    private int longitud;

    public ListaLigadaSimple() {
        this.cabeza = null;
        this.longitud = 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterator<T> iterator() {
        return new IteradorListaSimple();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void insertar(T elemento) throws IllegalArgumentException {
        if (elemento == null) {
            throw new IllegalArgumentException("ERROR: El elemento es nulo.");
        }
        if (this.longitud == 0) {
            Nodo cabezaN = new Nodo(elemento);
            this.cabeza = cabezaN;
            this.longitud = this.longitud + 1;
        }
        Nodo nuevoNodo = new Nodo(elemento);
        nuevoNodo.siguiente = this.cabeza;
        this.cabeza = nuevoNodo;
        this.longitud = this.longitud + 1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean buscar(T elemento) {
        if (elemento == null) {
            return false;
        }

        Nodo actual = this.cabeza;

        while (actual != null) {
            if (actual.elemento.equals(elemento)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T acceder(int i) throws IllegalArgumentException {
        if (i < 0) {
            throw new IllegalArgumentException(
                    "ERROR: El índice proporcionado es negativo, no se puede buscar en la lista.");
        }
        if (this.longitud <= i) {
            throw new IllegalArgumentException("ERROR: La longitud de la lista es menor al índice porporcionado.");
        }

        Nodo actual = this.cabeza;
        int contador = 0;

        while (contador < i) {
            actual = actual.siguiente;
            contador++;
        }

        return actual.elemento;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void eliminar(int i) {
        if (i == 0) {
            this.cabeza = this.cabeza.siguiente;
        } else {
            Nodo actual = this.cabeza;
            for (int indice = 0; indice < i - 1; indice++) {
                actual = actual.siguiente;
            }
            actual.siguiente = actual.siguiente.siguiente;
        }
        this.longitud--;
    }

    /**
     * {@inheritDoc}
     */
    public void eliminar(T elemento) {
        if (this.cabeza.elemento.equals(elemento)) {
            this.cabeza = this.cabeza.siguiente;
            this.longitud--;
        }

        Nodo actual = this.cabeza;
        while (actual.siguiente != null && !actual.siguiente.elemento.equals(elemento)) {
            actual = actual.siguiente;
        }
        actual.siguiente = actual.siguiente.siguiente;

        this.longitud--;
    }

    /**
     * {@inheritDoc}
     */
    public int devolverIndiceElemento(T elemento) throws IllegalArgumentException {
        if (!buscar(elemento)) {
            throw new IllegalArgumentException("ERROR: El elemento no se encuentra en la lista.");
        }

        int contador = 0;
        Nodo actual = this.cabeza;

        while (actual != null) {
            if (actual.elemento.equals(elemento)) {
                return contador;
            }
            contador++;
            actual = actual.siguiente;
        }

        throw new IllegalStateException("ERROR inesperado: elemento no encontrado tras verificación.");
    }

    /**
     * Obtiene la longitud actual de la lista.
     *
     * @return La longitud de la lista.
     */
    public int darLongitud() {
        return this.longitud;
    }

    /**
     * Obtiene el primer nodo de la lista.
     *
     * @return El primer nodo de la lista.
     */
    public Nodo darCabeza() {
        return this.cabeza;
    }

    /**
     * Devuelve una representación en cadena de la lista ligada.
     * Los elementos se muestran en orden, separados por comas y encerrados entre
     * corchetes.
     * 
     * @return una cadena con los elementos de la lista.
     */
    @Override
    public String toString() {
        String resultado = "[";
        boolean primero = true;
        for (T elemento : this) {
            if (!primero) {
                resultado += ", ";
            } else {
                primero = false;
            }
            resultado += elemento.toString();
        }

        resultado += "]";
        return resultado;
    }

}