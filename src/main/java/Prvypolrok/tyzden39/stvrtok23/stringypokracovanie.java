package Prvypolrok.tyzden39.stvrtok23;

public class stringypokracovanie {
    public static void main(String[] args) {

        String name = "Tomas";
        String priezvisko = "Kvackaj";
        String celeMeno = name + " " + priezvisko;

        celeMeno.indexOf("u");

        int indexPriezviska = celeMeno.indexOf(priezvisko);

        System.out.println(celeMeno.indexOf("T"));//lower case uppercase , index0F,substring,length
        System.out.println(celeMeno.substring(indexPriezviska));
        System.out.println(celeMeno.substring(6,13));
    }
}
