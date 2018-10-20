package figura;

//classe concreta
//estende classe astratta figura
public class Pentagono extends Figura {

//    costante privata globale
    private final double costanteArea;

//    costruttore
    public Pentagono() {
//        super();
        costanteArea = 1.72;
    }

//    override metodo perimetro di IFigura
    @Override
    public double perimetro() {
        return lato1 * 5;
    }

//    override metodo area di IFigura
    @Override
    public double area() {
        return Math.pow(lato1, 2) * costanteArea;
    }

//    metodo toString
    @Override
    public String toString() {
        return "PENTAGONO"
                + "\nPERIMETRO = " + perimetro()
                + "\nAREA = " + area();
    }

}
