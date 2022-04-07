package Prvypolrok.Tyzden6;

public class Trojuholnik {

    double stranaA;
    double stranaB;
    double stranaC;
    double vyska;


    public Trojuholnik(double Vstupnyatribut,double Vstupnyatribut2,double Vstupnyatribut3,double Vstupnyatribut4){
        if(Vstupnyatribut>0){
            stranaA = Vstupnyatribut;
        }
        if(Vstupnyatribut2>0){
            stranaB = Vstupnyatribut2;
        }
        if(Vstupnyatribut3>0){
            stranaC = Vstupnyatribut3;
        }
        if(Vstupnyatribut4>0){
            vyska = Vstupnyatribut4;
        }
        else{

        }
    }

    public double obvod(){
        return (stranaA+stranaB+stranaC);
    }

    public double obsah(){
        return stranaA*vyska;

    }
    public double obsah2(){
        double s;
        s = (stranaA+stranaB+stranaC)/2;
        return Math.sqrt(s*(s-stranaA)*(s-stranaB)*(s-stranaC));

    }

    @Override
    public String toString() {
        return "Trojuholnik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                ", stranaC=" + stranaC +
                ", vyska=" + vyska +
                '}';
    }
}
