package figura;

public class Quadrato extends Figura {

    public Quadrato() {
        super();
    }

    @Override
    public double perimetro() {
        return lato1 * 4;
    }

    @Override
    public double area() {
        return Math.pow(lato1, 2);
    }

    @Override
    public String toString() {
        return "QUADRATO:"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
