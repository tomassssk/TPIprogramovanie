package Prvypolrok.Tyzden5;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class randomUloha {

    static List<Integer> pole42 = new ArrayList<>();

    public static void main(String[] args) {

        priadeniePola(5);
        priadeniePola(6);
        priadeniePola(7);
        priadeniePola(6);
        vypisaniePola();
        zoradeniePola();



    }
    private static void vypisaniePola(){

        System.out.println(pole42.toString());
    }
    private static void zoradeniePola(){

        Collections.sort(pole42);

    }
    private static void priadeniePola(int tom){

           if(pole42.contains(tom))
           {
               System.out.println("element already exist");
           }
           else{
               pole42.add(tom);
               System.out.println("element was added");
           }


    }
}
