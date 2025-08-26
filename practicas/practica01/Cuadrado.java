public class Cuadrado extends PoligonoRegular {
    private static final int LADOS = 4;
    private static final String TIPOFIGURA = "Cuadrado";

    public Cuadrado(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * En el siguiente método se implementa una manera de conseguir el área de un
     * cuadrado.
     * 
     * @param longitudLado es la longitud de uno de los lados del cuadrado.
     * @return El resultado del cuadrado de la longitud de lado del cuadrado. Es
     *         decir, el área del cuadrado.
     */
    @Override
    public double calcularArea() {
        return Math.pow(this.longitudLado, 2);
    }
}