package figura;

public class MainFigura {

    public static void main(String[] args) {
        int latiUguali, nLati;
        double lato1;

        TriangoloEquilatero equilatero = new TriangoloEquilatero();
        TriangoloScaleno scaleno = new TriangoloScaleno(5, 6);
        Quadrato quadrato = new Quadrato();
        Rettangolo rettangolo = new Rettangolo(2);
        Pentagono pentagono = new Pentagono();

        nLati = equilatero.getNlati();
        lato1 = equilatero.getLato1();
        latiUguali = equilatero.getLatiUguali();
        switch (nLati) {
            case 3:
                if (latiUguali == 0 || latiUguali == 3) {
                    if (latiUguali == 0) {
                        scaleno.perimetro();
                        scaleno.area();
                        System.out.println(scaleno);
                    } else {
//                        equilatero.perimetro();
//                        equilatero.area();
                        System.out.println(equilatero);
                    }
                } else {
                    System.out.println("Non so calcolarne perimetro e area");
                }
                break;
            case 4:
                if (latiUguali == 4 || latiUguali == 2) {
                    if (latiUguali == 4) {
                        quadrato.perimetro();
                        quadrato.area();
                        System.out.println(quadrato);
                    } else {
                        rettangolo.perimetro();
                        rettangolo.area();
                        System.out.println(rettangolo);
                    }
                } else {
                    System.out.println("Non so calcolarne perimetro e area");
                }
                break;
            case 5:
                if (latiUguali == 5) {
                    System.out.println(pentagono);
                    break;
                } else {
                    System.out.println("Non so calcolarne perimetro e area");
                }
                break;
            default:
                System.out.println("Non so che figura è");
        }
    }

}
