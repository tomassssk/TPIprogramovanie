package Prvypolrok.Tyzden45;

public class UlohaString {
    public static void main(String[] args) {
    test();
    }
    static String text = "Clovek mierou svojeho chapania pracuje na seba," + "a mierou nechapania na tych,kto chape viac";

    static void test(){
        char z = ' ';
        int neco = 0;
        for(int x = 0;x<text.length();x++) {

            if(text.charAt(x)==z){
                neco++;

            }

        }
        System.out.println("Veta ma " + neco+ " medzier") ;

    }

}

