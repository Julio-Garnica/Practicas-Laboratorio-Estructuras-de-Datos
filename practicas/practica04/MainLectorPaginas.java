import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainLectorPaginas {

    /**
     * Este método asigna a la variable de tipo String nombreArchivo el valor
     * "paginas.txt"
     * Luego, crea un nuevo objeto llamado lista de tipo ListaLigadaSimple
     * Crea también un nuevo objeto de tipo Historial con "lista" como elementos
     * Ejecuta el método leerArchivo e imprime el objeto de tipo Historial
     * 
     * @param args
     */
    public static void main(String[] args) {
        String nombreArchivo = "paginas.txt";
        ListaLigadaSimple<Pagina> lista = new ListaLigadaSimple<Pagina>();
        Historial hist = new Historial(lista);

        leerArchivo(nombreArchivo, hist);

        System.out.println(hist);
    }

    /**
     * Lee un archivo línea por línea con el formato "<cadenaPagina> : <fecha>"
     * y muestra su contenido. Se asume que el formato es correcto.
     *
     * @param nombreArchivo el nombre del archivo a leer
     */
    public static void leerArchivo(String nombreArchivo, Historial hist) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" : ");
                String pagina = partes[0].trim();
                String fecha = partes[1].trim();

                Pagina paginaN = new Pagina(pagina, fecha);
                hist.agregarPagina(paginaN);
            }

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
