package Prvypolrok.tyzden41;

public class ulohynaopakovanie {
    public static void main(String[] args) {

        System.out.println("");
        uloha1();
        System.out.println("---------");
        uloha2();
        System.out.println("");
        uloha3();
        System.out.println("");
        objemValca(10,2);

    }
    static void uloha1(){

    System.out.println("To" + "to sa spusti len vtedy ked sa zavola metoda uloha1");

    }
    static void uloha2(){
        int jedna = 40;
        int dva = 23;
        int tri = jedna - dva;
        int str = jedna + dva;
        int pat = jedna * dva;
        double st = (double)jedna/dva;
        System.out.println("Scitanie = " + str);
        System.out.println("Odcitanie = "+ tri);
        System.out.println("modulo = "+ jedna%dva);
        System.out.println("Nasobenie "+ pat);
        System.out.println("Delenie "+st);

        boolean porovanie = jedna > tri;
        String faf;
        if (porovanie){
            faf = " ano";
        }
        else{
            faf = "nie";
        }
        System.out.print("je cislo " + jedna + "vacsie ako " + dva +faf);

        //pr cislo 4


    }
    static void uloha3(){
        int r = 20;
        int v = 15;

        System.out.print("Objem valca je " + (Math.PI)*(r*r)*v);
    }
        static void objemValca (double n1 , double n2){

        System.out.println("Objem valca je " + (Math.PI)*(n1*n1)*n2);


    }
}
