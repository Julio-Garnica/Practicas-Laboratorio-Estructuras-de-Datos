public class PracticaArreglos {

	/**
	 * El metodo genera una cadena String representado un arreglo de tipo objecto.
	 * 
	 * @param arreglo El arreglo de tipo objeto.
	 * @return El String en representacion del arreglo de tipo objeto.
	 */
	public static String imprimeArreglo(Object[] arreglo) {
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

	/**
	 * El metodo genera una cadena String representado un arreglo de tipo entero.
	 * 
	 * @param arreglo El arreglo de tipo entero.
	 * @return El String en representacion del arreglo de tipo entero.
	 */
	public static String imprimeArreglo(int[] arreglo) {
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

	/**
	 * El metodo genera una cadena String representado un arreglo de tipo double.
	 * 
	 * @param arreglo El arreglo de tipo double.
	 * @return El String en representacion del arreglo de tipo entero.
	 */
	public static String imprimeArreglo(double[] arreglo) {
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

	/**
	 * El metodo recibe como parametro un arreglo de tipo entero y regresa otro
	 * arreglo de tipo entero pero con los elementos del arreglo original volteados.
	 * 
	 * @param arreglo El arreglo original de tipo entero.
	 * @return El arreglo nuevo con los elementos del original volteados.
	 */
	public static int[] reversaArreglo(int[] arreglo) {
		if (arreglo == null) {
			return null;
		}
		int[] reversa = new int[arreglo.length];
		for (int i = 0; i < arreglo.length; i++) {
			reversa[i] = arreglo[arreglo.length - 1 - i];
		}
		return reversa;
	}

	/**
	 * El metodo genera un arreglo de tipo double con elementos iguales a las areas
	 * de las figuras del arreglo que se le da como parametro.
	 * 
	 * @param figuras El arreglo de tipo objeto que tiene como elementos a las
	 *                figuras.
	 * @return El arreglo de tipo double con elementos iguales a las areas de las
	 *         figuras.
	 */
	public static double[] guardarAreas(Figura[] figuras) {
		if (figuras == null) {
			return null;
		}
		double[] area = new double[figuras.length];
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i] instanceof Circulo) {
				Circulo circulo = (Circulo) figuras[i];
				area[i] = circulo.calcularArea();
			} else {
				area[i] = figuras[i].calcularArea();
			}
		}
		return area;
	}

	/**
	 * El metodo genera un arreglo de tipo Persona, que como elementos tiene el
	 * nombre y la edad de la persona que se genera al juntar a los arreglos
	 * originales proporcionados en los parametros.
	 * 
	 * @param nombres El arreglo de tipo String que tiene como elementos los nombres
	 *                de las personas.
	 * @param edades  El arreglo de tipo entero que tiene como elementos las edades
	 *                de las personas.
	 * @return El arreglo de tipo Persona que tiene como elementos el nombre y la
	 *         edad de las personas.
	 */
	public static Persona[] crearPersonas(String[] nombres, int[] edades) {
		if (nombres == null || edades == null || nombres.length != edades.length) {
			return null;
		}
		Persona[] persona = new Persona[nombres.length];
		for (int i = 0; i < nombres.length; i++) {
			persona[i] = new Persona(nombres[i], edades[i]);
		}
		return persona;
	}

	/**
	 * El metodo genera un arreglo de tamaño igual a la suma de las cardinalidades
	 * de los arreglos que se dan como parametros y sus elementos son los de los
	 * arreglos parametros.
	 * 
	 * @param arreglo1 El primero arreglo de tipo entero.
	 * @param arreglo2 El segundo arreglo de tipo entero.
	 * @return El arreglo generado de los dos originales que tiene cardinalidad
	 *         igual
	 *         a la suma de los arreglos parametro y los mismos elementos que estos.
	 */
	public static int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
		if (arreglo1 == null && arreglo2 == null) {
			return null;
		}
		int[] combinacion = new int[arreglo1.length + arreglo2.length];
		for (int i = 0; i < arreglo1.length; i++) {
			combinacion[i] = arreglo1[i];
		}
		for (int i = 0; i < arreglo2.length; i++) {
			combinacion[arreglo1.length + i] = arreglo2[i];
		}
		return combinacion;
	}

	/* Punto extra */
	public static Object[] eliminarDuplicados(Object[] arreglo) {
		return null;
	}
}