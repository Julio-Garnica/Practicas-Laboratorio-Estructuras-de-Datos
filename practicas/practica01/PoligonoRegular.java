public abstract class PoligonoRegular implements Figura {
    protected int numeroLados;
    protected double longitudLado;
    protected String tipoFigura;

    public PoligonoRegular(int numeroLados, double longitudLado, String tipoFigura) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
        this.tipoFigura = tipoFigura;
    }

    /**
     * En el siguiente método se implementa una manera de conseguir el perímetro de
     * un poligono regular.
     *
     * @param numeroLados  es el número de lados que tiene el poligono regular.
     * @param longitudLado es la longitud de uno de los lados del poligono regular.
     * @return El producto del número de lados del poligono por la longitud de uno
     *         de sus lados, es decir, el perímetro.
     */
    public double calcularPerimetro() {
        return this.numeroLados * this.longitudLado;
    }

    public abstract double calcularArea();

    public String toString() {
        return "El tipo de figura es: " + this.tipoFigura +
                "\n Su área es: " + this.calcularArea() +
                "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}