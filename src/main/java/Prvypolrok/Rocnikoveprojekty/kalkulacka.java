package Prvypolrok.Rocnikoveprojekty;

public class kalkulacka {
    public static void main(String[] args) {

        Plus(5,5);
        Minus(9,8);
        Deleno(5,0);
        krat(8,8);

    }
    static double Plus(double x, double x1){
        double x2 = x + x1;
        System.out.println(x+x1);
        return x2;
    }
    static double Minus(double y, double y1){
        double y2 = y - y1;
        System.out.println(y2);
        return y2;
    }
    static double Deleno(double z, double z1){
        double z2 = z/z1;
        if(z1==0){
            System.out.println("Nulou sa neda delit");
        }
        else {
            System.out.println(z2);
        }
        return z2;
    }
    static double krat(double m,double m1){
        double m2 = m*m1;
        System.out.println(m2);
        return m2;
    }
}
