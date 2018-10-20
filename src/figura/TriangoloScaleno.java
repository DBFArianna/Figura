package figura;

public class TriangoloScaleno extends Figura {

    protected double lato2, lato3;
    
  
    public TriangoloScaleno(double lato2, double lato3) {
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public void setLato2(double lato2) {
        if (lato2 > 0) {
            this.lato2 = lato2;
        }
    }

    public void setLato3(double lato3) {
        if (lato3 > 0) {
            this.lato3 = lato3;
        }
    }

    @Override
    public double perimetro() {
        return lato1 + lato2 + lato3;
    }

    @Override
    public double area() {
        double p = perimetro() / 2;

        return Math.sqrt(p * (p - lato1) * (p - lato2) * (p - lato3));

    }

    @Override
    public String toString() {
        if (lato1 < lato2 + lato3
                && lato2 < lato1 + lato3
                && lato3 < lato1 + lato2) {
            return "TRINAGOLO SCALENO"
                    + "\nPERIMETRO = " + perimetro()
                    + "\nAREA = " + area();
        }
        return "Non è triangolo!!";

    }

}
