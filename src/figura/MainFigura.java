package figura;

public class MainFigura {

    public static void main(String[] args) {
//        dichiarzione variabili
        int latiUguali, nLati;
        double lato1;

//        inizializzazione classi
        TriangoloEquilatero equilatero = new TriangoloEquilatero();
        TriangoloScaleno scaleno = new TriangoloScaleno(5, 6);
        Quadrato quadrato = new Quadrato();
        Rettangolo rettangolo = new Rettangolo(2);
        Pentagono pentagono = new Pentagono();

//        assegnazione valori con richiamo metodi get
        nLati = equilatero.getNlati();
        lato1 = equilatero.getLato1();
        latiUguali = equilatero.getLatiUguali();

//        controllo n lati e lati uguali
//        stampa risultati
        switch (nLati) {
            case 3:
                if (latiUguali == 0 || latiUguali == 3) {
                    if (latiUguali == 0) {
                        System.out.println(scaleno);
                    } else {
                        System.out.println(equilatero);
                    }
                } else {
                    System.out.println("Non so calcolarne perimetro e area");
                }
                break;
            case 4:
                if (latiUguali == 4 || latiUguali == 2) {
                    if (latiUguali == 4) {
                        System.out.println(quadrato);
                    } else {
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
