public class Circulo implements Figura {

    public double radio;
    public double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * En el siguiente método se implementa una manera de conseguir el área de un
     * círculo.
     * 
     * @param PI    es el número pi redondeado a 3.1416.
     * @param radio es el radio del círculo.
     * @return El producto de pi, por el radio del círculo al cuadrado, es decir, el
     *         área del círculo.
     */
    @Override
    public double calcularArea() {
        return PI * Math.pow(this.radio, 2);
    }

    /**
     * En el siguiente método se implementa la manera de conseguir el perímetro de
     * un círculo.
     * 
     * @param PI    es el número pi redondeado a 3.1416.
     * @param radio es el radio del círculo.
     * @return El producto del número dos, por pi, por el radio del círculo, es
     *         decir, el perímetro del círculo.
     */
    @Override
    public double calcularPerimetro() {
        return 2 * PI * this.radio;
    }

    public String toString() {
        return "El tipo de figura es: Círculo" +
                "\n Su área es: " + this.calcularArea() +
                "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}