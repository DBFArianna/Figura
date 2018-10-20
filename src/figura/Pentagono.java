package figura;

public class Pentagono extends Figura {

    private final double costanteArea;

    public Pentagono() {
        costanteArea = 1.72;
    }

    @Override
    public double perimetro() {
        return lato1 * 5;
    }

    @Override
    public double area() {
        return Math.pow(lato1, 2) * costanteArea;
    }

    @Override
    public String toString() {
        return "PENTAGONO"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
