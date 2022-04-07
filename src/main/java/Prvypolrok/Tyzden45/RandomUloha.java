package Prvypolrok.Tyzden45;

public class RandomUloha {
    public static void main(String[] args) {
    Uloha();
    }
    static void Uloha() {

        boolean parne;
        for(int i = 0;i<5;i++){
            if(i%2==0){

                parne = true;
                System.out.println(parne);
            }

            else{

                parne = false;
                System.out.println(parne);
            }

        }
    }

}
