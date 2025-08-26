public class Pentagono extends PoligonoRegular {

    private static final int LADOS = 5;
    private static final String TIPOFIGURA = "Pentagono";

    public double PI = 3.1416;

    public Pentagono(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * En el siguiente método se implementa una manera de conseguir el área de un
     * pentagono.
     * 
     * Utiliza la apotema del pentagono {@link #calcularApotema()} y el perímetro
     * del pentagono
     * {@link #calcularPerimetro()}
     *
     * @return La división del producto del perímetro del pentagono, por su apotema,
     *         entre el número dos.
     */
    @Override
    public double calcularArea() {
        return (calcularPerimetro() * calcularApotema()) / 2;
    }

    /**
     * En el siguiente método se implementa una manera de conseguir el apotema de un
     * pentagono.
     * 
     * @param longitudLado es la longitud de uno de los lados del pentagono.
     * @param LADOS        es el número de lados del pentagono.
     * @return La división de la longitud de uno de los lados del pentagono, entre
     *         el producto del número dos, por la tangente de pi entre el número de
     *         lados del pentagono. Es decir, el apotema del pentagono.
     */
    public double calcularApotema() {
        return this.longitudLado / (2 * Math.tan(PI / this.LADOS));
    }

}