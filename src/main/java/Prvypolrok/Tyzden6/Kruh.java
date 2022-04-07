package Prvypolrok.Tyzden6;

public class Kruh {

    double r;

    public Kruh(double Vstupnyatribut){
        if(Vstupnyatribut>0){
        r = Vstupnyatribut;
        }
        else{

        }

    }
    public double obvod() {
        return 2 * Math.PI * r;
    }

    public double obsah() {
        return Math.PI * (r * r);
    }

    @Override
    public String toString() {
        return "Kruh{" +
                "r=" + r +
                '}';
    }
}
