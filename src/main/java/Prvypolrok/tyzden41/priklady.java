package Prvypolrok.tyzden41;

public class priklady {
    public static void main(String[] args) {

        Pr2();
        Pr3();

    }
    static void Pr1(int a){

        for(int f = 1;f<11;f++)
        {

            System.out.println(f);

        }

    }
    static void Pr2(){

        int x=0;

        for(int f = 1;f<11;f++)
        {

            x=x+f;

        }
            System.out.println(x);
    }
    static void Pr3(){
        int y= 0;
        String x = "Pata je slaby";
        while(y<13)
            {
                System.out.println(x.charAt(y));
                y++;


            }

    }

}
