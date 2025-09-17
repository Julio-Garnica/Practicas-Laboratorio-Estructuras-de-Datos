
public interface Lista<T> extends Coleccion<T> {

    /**
     * Este método elimina el i-ésimo elemento de la lista.
     * 
     * @param indice Es el índice que nos indica el elemento a eliminar de la lista.
     */
    public void eliminar(int indice);

    /**
     * Este método devuelve el i-ésimo elemento de la lista.
     * 
     * @param indice Es el índice proporcionado para encontrar su elemento en la
     *               lista.
     * @return El elemento correspondiente al índice dado.
     */
    public T acceder(int indice);

    /**
     * Este método devuelve el índice de la primera aparición de un elemento en una
     * lista.
     * 
     * @param elemento Es el elemento proporcionado para encontrar el índice de su
     *                 primera aparición en la lista.
     * @return Un número entero que resulta ser el índice de la primera aparición
     *         del elemento dado.
     */
    public int devolverIndiceElemento(T elemento);

    /**
     * Este método devuelve el número de elementos de la lista.
     * 
     * @return Un número entero que resulta ser la cantidad de elementos contenidos
     *         en la lista.
     */
    public int darLongitud();

}