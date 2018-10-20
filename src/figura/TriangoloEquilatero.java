package figura;

public class TriangoloEquilatero extends Figura {

    public TriangoloEquilatero() {
        super();
    }

    @Override
    public double perimetro() {
        return lato1 * 3;
    }

    @Override
    public double area() {
        double p = perimetro() / 2;

        return Math.sqrt(p * Math.pow((p - lato1), 3));

    }

    @Override
    public String toString() {

        return "TRINAGOLO EQUILATERO"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();

    }

}
