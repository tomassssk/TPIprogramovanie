package Prvypolrok.tyzden41;

public class DUmetody {
    public static void main(String[] args) {

        povrchValca(10, 2);
        obsahElipsy(5, 3);
        obvodTrojuholnika(5, 3, 1);
        obsahTrojuholnika(5, 3);
        obvod6Uholnika(5);
        obsah6Uholnika(5);


    }

    static void povrchValca(double r, double v) {

        System.out.println(" Povrch valca " + (2 * Math.PI * r * (r + v)));
    }

    static void obsahElipsy(double a, double b) {

        System.out.println(" Obsah elipsy " + (Math.PI * a * b));
    }

    static void obvodTrojuholnika(double a, double b, double c) {

        System.out.println(" Obvod Trojuholnika " + (a + b + c));
    }

    static void obsahTrojuholnika(double a, double va) {

        System.out.println(" Obsah Trojuholnika " + (0.5 * a * va));
    }

    static void obvod6Uholnika(double a) {

        System.out.println(" Obvod 6-Uholnika " + (6 * a));
    }

    static void obsah6Uholnika(double a) {

        System.out.println(" Obsah 6-Uholnika " + (3 * ( 3 / 3) * 0.5 * (a * a)));
    }
}




