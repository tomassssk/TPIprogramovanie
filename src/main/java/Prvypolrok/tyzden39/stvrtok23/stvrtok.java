package Prvypolrok.tyzden39.stvrtok23;

public class stvrtok {
    public static void main(String[] args) {

        int m = 5;
        double x = 3.475;
        long y = 3181329148l;
        int z = 0X48AE; //16tkova
        int f = 0b1010111; //binarna //pisomka overflow

        System.out.println(m);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(f);
        System.out.println("---------------------------");

        //pr2 increment decrement
        int l = 1;

        int g = 1;

        System.out.println(" x sa rovna " + l + "vysledok :" + l++ * 2 ); // 1 * 2 = 2 ++ prepise l na 2 (je to iny priklad tym padom to pripise kvoli ++ iba k l + 1 a l bude 2 , keby sa to zopakuje tak bude l = 3, priklad to neovlivni iba to zmeni zakladne cislo o 1)
        System.out.println(" y sa rovna " + g + "vysledok :" + ++g * 2); // g+1 * 2  = 4

    }
}
