package Prvypolrok.Tyzden46;

public class UlohaString {
    public static void main(String[] args) {
        jePalindron("ABBA");
    }

    static boolean jePalindron(String KontrolneSlovo){

        String spolu1 ="";
        for(int x = 0;x<KontrolneSlovo.length();x++){

           // System.out.println(KontrolneSlovo.charAt(x));
            spolu1 = spolu1 + KontrolneSlovo.charAt(x);
            System.out.println(spolu1);

        }
        String spolu ="";
        for(int i = KontrolneSlovo.length()-1;i>=0;i--){
           // System.out.println(KontrolneSlovo.charAt(i));

            spolu = spolu + KontrolneSlovo.charAt(i);
            System.out.println(spolu);
        }

        return KontrolneSlovo==spolu;

    }
}
