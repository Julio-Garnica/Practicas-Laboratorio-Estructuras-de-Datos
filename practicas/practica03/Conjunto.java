public abstract class Conjunto<T> implements Iterable<T> {

    /**
     * Determina si un elemento pertenece a un conjunto.
     * 
     * @param elemento
     * @return Verdadero o falso.
     */
    public abstract boolean pertenece(T elemento);

    /**
     * Agrega un elemento a un conjunto.
     * 
     * @param elemento
     * @return Un conjunto, que será el mismo que el de entrada si y solo si el
     *         elemento que se usó ya pertenece al conjunto. Sino, será uno nuevo
     *         con los mismos elementos que el de entrada, más el elemento a
     *         agregar.
     */
    public abstract Conjunto<T> agregarElemento(T elemento);

    /**
     * Determina si un conjunto está contenido en otro.
     * 
     * @param c
     * @return Verdadero o falso.
     */
    public abstract boolean contieneConjunto(Conjunto<T> c);

    /**
     * Devuelve la unión de dos conjuntos.
     * 
     * @param c
     * @return Un conjunto con los elementos correspondientes a los elementos del
     *         primer conjunto unión los del segundo conjunto.
     */
    public abstract Conjunto<T> union(Conjunto<T> c);

    /**
     * Devuelve la intersección de dos conjuntos.
     * 
     * @param c
     * @return Un conjunto con los elementos correspondientes a los elementos del
     *         primer conjunto, intersección los del segundo conjunto.
     */
    public abstract Conjunto<T> interseccion(Conjunto<T> c);

    /**
     * Determina si dos conjuntos son iguales.
     * 
     * @param c
     * @return Verdadero o falso.
     */

    public abstract boolean iguales(Conjunto<T> c);

    /**
     * Devuelve el número de elementos de un conjunto.
     * 
     * @return La cardinalidad de un conjunto.
     */
    public abstract int obtenerCardinalidad();

    @Override
    public String toString() {
        if (this.obtenerCardinalidad() == 0) {
            return "{}";
        }
        String resultado = "{";

        // Se iteran los elementos de un conjunto sin importar como se defina el
        // iterador en cada implementación de la interfaz
        int i = 0;
        for (T e : this) {
            resultado += e.toString();
            if (i < this.obtenerCardinalidad() - 1) {
                resultado += ", ";
            }
            i++;
        }
        resultado += "}";
        return resultado;
    }
}