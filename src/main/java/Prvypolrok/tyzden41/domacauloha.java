package Prvypolrok.tyzden41;

public class domacauloha {
    public static void main(String[] args) {

        int r = 2;
        int v = 4;
        int a = 5;
        int b = 6;
        int c = 8;
        int va = 9;

        System.out.println(" Povrch valca " + (2*Math.PI*r*(r+v)));
        System.out.println(" Obsah elipsy " + (Math.PI*a*b));
        System.out.println(" Obvod Trojuholnika " + (a+b+c));
        System.out.println(" Obsah Trojuholnika " + (0.5*a*va));
        System.out.println(" Obvod 6-Uholnika " + (6*a));
        System.out.println(" Obsah 6-Uholnika " + (3*((double)3/3)*0.5*(a*a)));



    }
}
