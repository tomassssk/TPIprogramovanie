package primitivedatatypes;

public class PrimitiveDataTypes01 {

    public static void main(String[] args) { // main metoda sluzi na to aby java vedela kde ma zacat a skoncit. // JVM masina ktora hlada main metodu na to aby dokazala spustit dany kod .

        int nasaPrvaPremenna = 10;
        int nasaDruhaPremenna = 20;
        int Den = 14;
        int Mesiac = 2;
        int Rok = 2005;
        int vysledok2 = Den+Mesiac+Rok;
        long velkeCislo = 3_000_000_000l; //64b
        int x; //32b
        short y; //16b
        byte z; //8b








        int vysledok = nasaDruhaPremenna + nasaDruhaPremenna;

        System.out.println(vysledok);
        System.out.println(vysledok2);
        System.out.println(Den + "." + Mesiac + "." + Rok);

    }
}
