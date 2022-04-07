package Prvypolrok.Tyzden5;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIterationSortSearch {
    public static void main(String[] args) {

        ArrayList<String> polestringov = new ArrayList<>();
        polestringov.add("Potok");
        polestringov.add("MinkoTiminko");
        polestringov.add("Standa");
        polestringov.add("Jozka");
        polestringov.add("Bulica");

        int test = Collections.binarySearch(polestringov, "Potok");
        //System.out.println(polestringov.get(test));

        Collections.sort(polestringov);
        Collections.binarySearch(polestringov,"Potok");

       test = Collections.binarySearch(polestringov, "Potok");
       System.out.println(polestringov.get(test));

       // binar search hlada v zoradenom poli.

        for (int i =0;i<polestringov.size();i++){
            System.out.println("//");
            polestringov.remove(3);
            System.out.println("Po zmazani elementu" + polestringov);

            int y = 0;  // pokial pouzijeme vylepseny for cyklus , niesme schopny pracovat s polom.

            for(String s: polestringov){   // string je objekt , pole stringov , moje pole s hodnotama  . STRING S=POLESTRINGOV Musi mat rovnaky primitivny datovy typ.
                System.out.println(s + "tu si pridam k elementu nieco");
                System.out.println("Iteracia" + y++);
                polestringov.remove(3);
                System.out.println("Po zmazani elementu" + polestringov);
            }
        }

    }
}
