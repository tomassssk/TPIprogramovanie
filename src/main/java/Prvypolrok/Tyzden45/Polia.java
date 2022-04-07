package Prvypolrok.Tyzden45;

import java.util.Arrays;

public class Polia {

    public static void main(String[] args) {
        PoliaOsem();

    }

    static void PoliaOsem() {

        int[] int1 = {8, 5, 6, 3};
        double[] double1 = {85, 56, 95, 56};
        long[] long1 = {5, 5};
        byte[] byte1 = new byte[5];
        float[] float1 = new float[5];
        short[] short1 = new short[5];
        char[] char1 = new char[5];
        char[] char2 = {0,1,104};
        String[] string1 = new String[5];

        // sort , array to string
        int[] randomnumbers = new int[]{1,5,5,6,58,69,9,5,41,56};
        //Arrays.sort(randomnumbers);
        //System.out.println(randomnumbers.toString());
        //System.out.println(Arrays.toString(randomnumbers));
        // Binary search

        int vysledok1 = Arrays.binarySearch(randomnumbers, 6);
        System.out.println(vysledok1);

        Arrays.sort(randomnumbers);
        vysledok1 = Arrays.binarySearch(randomnumbers,6);
        System.out.println(vysledok1);

        System.out.println(Arrays.toString(randomnumbers));


    }
}