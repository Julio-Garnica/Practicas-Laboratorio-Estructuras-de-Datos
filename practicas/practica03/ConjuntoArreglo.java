import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConjuntoArreglo<T> extends Conjunto<T> {

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int indice = 0;

            @Override
            public boolean hasNext() {
                return indice < ConjuntoArreglo.this.elementos.length;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return elementos[indice++];
            }
        };
    }

    public T[] elementos;

    public ConjuntoArreglo() {
        this.elementos = (T[]) new Object[0];
    }

    public ConjuntoArreglo(T[] elementos) {
        if (elementos == null) {
            this.elementos = (T[]) new Object[0];
        } else if (UtilArreglos.tieneDuplicados(elementos)) {
            throw new IllegalArgumentException("El arreglo contiene elementos duplicados.");
        } else if (UtilArreglos.contieneNull(elementos)) {
            throw new IllegalArgumentException("El arreglo contiene elementos nulos.");
        } else {
            this.elementos = UtilArreglos.copiaArregloGenerico(elementos);
        }
    }

    /**
     * Método que verifica sin elemento pertenece o no a un conjunto.
     */
    public boolean pertenece(T elemento) {
        for (int aux = 0; aux < this.obtenerCardinalidad(); aux++) {
            if (elementos[aux].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Método que agrega un elemento a un conjunto. Devolverá un nuevo conjunto solo
     * si el elemento a agregar no pertenece al conjunto inicial, si fuera el caso
     * contrario entonces regresa el mismo conjunto inicial.
     */
    public ConjuntoArreglo<T> agregarElemento(T elemento) {
        if (this.pertenece(elemento)) {
            return this;
        }

        int n = elementos.length;
        T[] elementosNuevo = (T[]) new Object[n + 1];
        for (int i = 0; i < n; i++) {
            elementosNuevo[i] = elementos[i];
        }
        elementosNuevo[n] = elemento;
        elementos = elementosNuevo;
        return this;
    }

    /**
     * Método que verifica si un conjunto está contenido en otro.
     */
    public boolean contieneConjunto(Conjunto<T> c) {
        for (T aux : c) {
            if (!this.pertenece(aux)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que nos regresa un conjunto que resulta ser la unión de los dos
     * conjuntos de entrada.
     */
    public Conjunto<T> union(Conjunto<T> c) {
        T[] elementosUnionAux = (T[]) new Object[this.obtenerCardinalidad() + c.obtenerCardinalidad()];
        int contador = 0;
        for (T aux : this) {
            elementosUnionAux[contador] = aux;
            contador++;
        }
        for (T aux2 : c) {
            boolean yaExiste = false;
            for (int j = 0; j < contador; j++) {
                if (elementosUnionAux[j] == aux2) {
                    yaExiste = true;
                    break;
                }
            }
            if (!yaExiste) {
                elementosUnionAux[contador] = aux2;
                contador++;
            }
        }
        T[] elementosUnion = (T[]) new Object[contador];
        for (int i = 0; i < contador; i++) {
            elementosUnion[i] = elementosUnionAux[i];
        }
        return new ConjuntoArreglo<>(elementosUnion);
    }

    /**
     * Método que nos devuelve un conjunto que resulta ser la intersección de los
     * dos conjuntos de entrada.
     */
    public Conjunto<T> interseccion(Conjunto<T> c) {
        T[] elementosInterAux = (T[]) new Object[Math.min(this.obtenerCardinalidad(), c.obtenerCardinalidad())];
        int contador = 0;
        for (T aux : c) {
            if (this.pertenece(aux)) {
                elementosInterAux[contador] = aux;
                contador++;
            }
        }
        T[] elementosInter = (T[]) new Object[contador];
        for (int i = 0; i < contador; i++) {
            elementosInter[i] = elementosInterAux[i];
        }
        return new ConjuntoArreglo<>(elementosInter);
    }

    /**
     * Método que verifica si dos conjuntos son iguales por medio de una doble
     * conjunción.
     */
    public boolean iguales(Conjunto<T> c) {
        return this.contieneConjunto(c) && c.contieneConjunto(this);
    }

    /**
     * Método que devuelve la cardindalidad de un conjunto.
     */
    public int obtenerCardinalidad() {
        return this.elementos.length;
    }

}