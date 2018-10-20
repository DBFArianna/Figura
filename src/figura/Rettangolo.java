package figura;

public class Rettangolo extends Figura {

    public double lato2;

    public Rettangolo(double lato2) {
        this.lato2 = lato2;
    }

    public double getLato2() {
        return lato2;
    }

    @Override
    public double perimetro() {
        return (lato1 * 2) + (lato2 * 2);
    }

    @Override
    public double area() {
        return lato1 * lato2;
    }

    @Override
    public String toString() {
        return "RETTANGOLO"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
