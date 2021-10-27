package Prvypolrok.tyzden42;

public class uloha {
    public static void main(String[] args) {
        ParneNeparne(2000);
        PriestupnyRok(1900);
    }
    static void ParneNeparne(int x){
        if(x % 2 ==0)
        {
            System.out.println("Cislo " + x + " je parne");
        }
        else
        {
            System.out.println("Cislo " + x + " je neparne");
        }

    }
    static void PriestupnyRok(int x){
        if(x % 4 ==0){
            if(x%100 ==0){
                if(x%400 ==0){
                    System.out.println("Rok " + x + " je priestupny");
                }
                else{
                    System.out.println("Rok " + x + " nie je priestupny");
                }
            }
            else{
                System.out.println("Rok " + x + " je priestupny");
            }
        }
        else{
            System.out.println("Rok " + x + " nie je priestupny");
        }
    }
}
// %4 %100 %400