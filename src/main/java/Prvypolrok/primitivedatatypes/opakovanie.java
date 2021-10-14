package Prvypolrok.primitivedatatypes;

public class opakovanie {
    public static void main(String[] args) {

        String name = "Tomas";
        String priezvisko = "Kvackaj";
        String celeMeno = name + priezvisko;

        name = "Tomas";
        priezvisko = "Kvackaj";
        celeMeno = name + priezvisko;


        boolean vysledok = 1 < 2;

        int randomNumber = (int) (Math.random() * 50);
        System.out.println(randomNumber);

        System.out.println("Dlzka mojho mena je " + celeMeno.length());

        boolean vysledok2 = celeMeno.length() > randomNumber;

        System.out.println("Dlzka mojho mena je vacsia ako nahodne cislo ?" + vysledok2);

        String Str =("JOzka je slaby");
        System.out.println(Str.toUpperCase() );
        System.out.println(Str.toLowerCase() );

        String nieco ="f";
        String nic ="";
        System.out.println(nieco.isEmpty());
        System.out.println(nic.isEmpty());


    }
}