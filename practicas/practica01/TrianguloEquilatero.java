public class TrianguloEquilatero extends PoligonoRegular {
    private static final int LADOS = 3;
    private static final String TIPOFIGURA = "Triángulo equilátero";

    public TrianguloEquilatero(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * En el siguiente método se implementa una manera de conseguir el área de un
     * tríangulo equílatero.
     * 
     * @param longitudLado es la longitud de uno de los lados del triángulo
     *                     equílatero.
     * @return El producto del cuadrado de la longitud de lado del triángulo
     *         equílatero, por la raíz de tres, entre el número cuatro. Es decir, el
     *         área del triángulo equílatero.
     */
    @Override
    public double calcularArea() {
        return (Math.pow(this.longitudLado, 2) * Math.sqrt(3)) / 4;
    }
}