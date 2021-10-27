package Prvypolrok.tyzden42;

public class CyklyWhileaDoWhile {
    public static void main(String[] args) {
        while1("Tomas");
    }

    static void while1(String meno){

        int i = 0;

        while (i<10){

            System.out.println(i+meno);
            i++;
        }

    }
    static void DoWhile(String Priezvisko){

        int x=0;
        do{
            System.out.println(x+Priezvisko);
            x++;
        }
        while(x<10);
    }
}
