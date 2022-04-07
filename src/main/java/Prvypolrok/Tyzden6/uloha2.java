package Prvypolrok.Tyzden6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uloha2 {
    public static void main(String[] args) {
         parne(Arrays.asList(1,2,3,4,5,6));
         neparne(Arrays.asList(1,2,3,4,5,6,7,8,9,6,5));
    }
    static void parne(List<Integer> parn){
            for(int i: parn){
                if(i%2==0){
                    System.out.println(i+"Cislo je parne");
                }

            }
        }
    static void neparne(List<Integer> neparne){
        for(int j: neparne){
            if(j%2!=0){
                System.out.println(  j+"Cislo je neparne");


            }

        }
    }
}
