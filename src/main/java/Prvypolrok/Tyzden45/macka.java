package Prvypolrok.Tyzden45;

public class macka {
    public static void main(String[] args) {

    }
    static boolean mackaSaHra(boolean leto,int teplota){
        boolean Cat;
        if(leto){
            if(teplota>=25&teplota<45) {
                Cat = true;
            }
            else{
                Cat = false;
            }
        }
        else{
            if(teplota>25&teplota<35){
                Cat = true;
            }
            else{
                Cat = false;
            }
        }
        if(Cat==true){
            System.out.println("Macka sa hra");
        }
        else{
            System.out.println("Macka sa nehra");
        }
        return Cat;
    }
}


