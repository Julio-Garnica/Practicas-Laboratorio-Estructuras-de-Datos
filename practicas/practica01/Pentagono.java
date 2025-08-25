public class Pentagono extends PoligonoRegular {
    
    private static final int LADOS = 5;
    private static final String TIPOFIGURA = "Pentagono";

    public double PI = 3.1416;

    public Pentagono(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    @Override
    public double calcularArea() {
        return (calcularPerimetro() * calcularApotema()) / 2;
    }

    public double calcularApotema() {
        return longitudLado / (2 * Math.tan(PI / LADOS));
    }

}