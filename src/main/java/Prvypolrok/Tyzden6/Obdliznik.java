package Prvypolrok.Tyzden6;

public class Obdliznik {

    double stranaA;
    double stranaB;

    public  Obdliznik(double Vstupnyatribut, double Vstupnyatribut2) {
        if (Vstupnyatribut > 0) {
            stranaA = Vstupnyatribut;
        }
        if (Vstupnyatribut2 > 0) {
            stranaB = Vstupnyatribut2;
        }
    }


    public double obvod(){

            return 2*(stranaA+stranaB);
        }


    public double obsah(){

        return stranaB+stranaA;

    }

    @Override
    public String toString() {
        return "Obdliznik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                '}';
    }
}
