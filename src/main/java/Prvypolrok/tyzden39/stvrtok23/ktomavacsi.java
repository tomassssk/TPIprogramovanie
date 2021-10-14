package Prvypolrok.tyzden39.stvrtok23;

public class ktomavacsi {
    public static void main(String[] args) {

        int ja = 15 * 2 * 2005;
        int soused = 18 * 7 * 2005;

        boolean vysledok = ja > soused;

        System.out.println(" mam ho vacsi? " + vysledok);

        String faf;

        if (vysledok) {
            faf = "ano";

        }
        else{
            faf="nie";
        }
        System.out.println(" mam ho vacsi? " + faf);

        int c1 = 1;
        int c2 = 2;

        boolean vypocet = c1 < c2; // je mensi , neni mensi  - / c1 > c2 je vacsi neni vacsi

        System.out.println(vypocet);

    }
}
