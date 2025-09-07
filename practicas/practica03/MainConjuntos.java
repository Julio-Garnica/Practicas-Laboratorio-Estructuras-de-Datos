public class MainConjuntos {

    /**
     * Ejemplos de la implementación de la estructura de datos Conjuntos.
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Prueba con Strings
        String[] frutas = { "Manzana", "Banana", "Naranja" };
        String[] otrasFrutas = { "Banana", "Kiwi" };

        /**
         * Declaración de los conjuntos ejemplo tipo String.
         */
        Conjunto<String> conjunto1 = new ConjuntoArreglo<>(frutas);
        Conjunto<String> conjunto2 = new ConjuntoArreglo<>(otrasFrutas);

        /**
         * Ejemplo de pertenencia de elementos destacados en los conjuntos ejemplos tipo
         * String.
         */
        System.out.println("Conjunto 1 contiene a 'Banana': " + conjunto1.pertenece("Banana"));
        System.out.println("Conjunto 1 contiene a 'Kiwi': " + conjunto1.pertenece("Kiwi"));

        /**
         * Ejemplo de agregarElemento en uno de los conjuntos ejemplo tipo String.
         */
        conjunto1.agregarElemento("Kiwi");
        System.out.println("Después de agregar 'Kiwi', conjunto 1 contiene a 'Kiwi': " + conjunto1.pertenece("Kiwi"));

        /**
         * Ejemplo de contenención de los conjuntos ejemplo de tipo String.
         */
        System.out.println("Conjunto 1 contiene a Conjunto 2: " + conjunto1.contieneConjunto(conjunto2));

        /**
         * Ejemplo de unión de los conjuntos ejemplo de tipo String.
         */
        System.out.println("Unión de conjunto1 y conjunto2:");
        System.out.println(conjunto1.union(conjunto2));

        /**
         * Ejemplo de intersección de los conjunto ejemplo de tipo String.
         */
        System.out.println("Intersección de conjunto1 y conjunto2:");
        System.out.println(conjunto1.interseccion(conjunto2));

        /**
         * Ejemplo de igualdad de los conjuntos ejemplo de tipo String.
         */
        System.out.println("¿conjunto1 es igual a conjunto2?: " + conjunto1.iguales(conjunto2));

        // Prueba con enteros
        Integer[] nums1 = { 1, 2, 3 };
        Integer[] nums2 = { 3, 4, 5 };

        /**
         * Declaración de los conjuntos ejemplo tipo Entero.
         */
        Conjunto<Integer> intConj1 = new ConjuntoArreglo<>(nums1);
        Conjunto<Integer> intConj2 = new ConjuntoArreglo<>(nums2);

        /**
         * Ejemplo de unión de los conjuntos ejemplo Tipo entero.
         */
        System.out.println("Unión de enteros:");
        System.out.println(intConj1.union(intConj2));

        /**
         * Ejemplo de intersección de los conjuntos ejemplo Tipo entero.
         */
        System.out.println("Intersección de enteros:");
        System.out.println(intConj1.interseccion(intConj2));

        /**
         * Ejemplo de igualdad con los conjuntos ejemplo de tipo Entero.
         */
        System.out.println("¿Los conjuntos de enteros son iguales?: " + intConj1.iguales(intConj2));
    }
}
