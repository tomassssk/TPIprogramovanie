package Prvypolrok.Tyden11.pornofilm;

import java.util.List;

import static Prvypolrok.Tyden11.pornofilm.Commons.pornoHerci;
import static Prvypolrok.Tyden11.pornofilm.Commons.pornoHerecky;

public class Nasefilmy2 {

    public static void main(String[] args) {

        PornoHerecka pornoHerecka = pornoHerecky().get(0);
        List<PornoHerec> herci = pornoHerci();
        for (PornoHerec pornoHerec : herci) {
            System.out.println(pornoHerec.getObjemVacku());

        }

        pornoHerecka.robiGangbang(pornoHerci());

        for (PornoHerec pornoHerec : herci) {

            System.out.println(pornoHerec.getObjemVacku());

        }


    }

    private static void getObjemVacku(){
        pornoHerci().forEach( ph -> System.out.println(ph.getObjemVacku()));

    }
}

