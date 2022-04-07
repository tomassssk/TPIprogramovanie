package Prvypolrok.Tyzden6;

public class Tro {
    public static void main(String[] args) {
        new Trojuholnik(4,3,2,1);
        new Kruh(4);

       Trojuholnik tojuholnik = new Trojuholnik(4,3,2,1);

        System.out.println("OBSAH TROJUHOLNIKA JE : " + tojuholnik.obsah2());
        System.out.println("OBSAH TROJUHOLNIKA JE : " + tojuholnik.obvod());

        Kruh kruhoslav = new Kruh(5);
        System.out.println("OBSAH KRUHU JE : " + kruhoslav.obsah());
        System.out.println("OBSAH KRUHU JE : " + kruhoslav.obvod());

        System.out.println(kruhoslav);

    }
}
