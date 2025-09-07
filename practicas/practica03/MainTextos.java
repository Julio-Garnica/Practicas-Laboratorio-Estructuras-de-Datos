import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Método donde se declará los conjuntos a evaluar y después devuelve su
 * intersección.
 */
public class MainTextos {
    public static void main(String[] args) {
        String archivo1 = "rosa.txt";
        String archivo2 = "elDicho.txt";

        try {
            ConjuntoArreglo<String> conjunto1 = crearConjuntoDeArchivo(archivo1);
            ConjuntoArreglo<String> conjunto2 = crearConjuntoDeArchivo(archivo2);

            System.out.println("Palabras sin repetir de de " + archivo1 + ":");
            System.out.println(conjunto1);

            System.out.println("\nPalabras sin repetir de " + archivo2 + ":");
            System.out.println(conjunto2);

            ConjuntoArreglo<String> interseccion = (ConjuntoArreglo<String>) conjunto1.interseccion(conjunto2);
            System.out.println("\nPalabras en común:");
            System.out.println(interseccion);

        } catch (IOException e) {
            System.err.println("Error leyendo archivo: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error creando conjuntos: " + e.getMessage());
        }
    }

    /**
     * Método que genera un conjunto con elementos las palabras de un texto de
     * entrada.
     * 
     * @param nombreArchivo El texto a evaluar.
     * @return Un conjunto con elementos las palabras sin repetición deun texto.
     * @throws IOException Error leyendo los archivos .txt
     */
    public static ConjuntoArreglo<String> crearConjuntoDeArchivo(String nombreArchivo) throws IOException {
        ConjuntoArreglo<String> conjunto = new ConjuntoArreglo<>();
        BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] palabras = linea.split("[\\s,.¡!¿?;:()\"-]+");
            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    conjunto.agregarElemento(palabra.toLowerCase());
                }
            }
        }
        br.close();
        return conjunto;
    }

}