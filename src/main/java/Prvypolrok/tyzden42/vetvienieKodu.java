package Prvypolrok.tyzden42;

public class vetvienieKodu {
    public static void main(String[] args) {
        DnivTyzdni(8);

    }
    public static void ifElse(boolean vieJavu, String Meno){
        if(vieJavu){
            Meno=Meno+"Vie Javu";
        }
        Meno = Meno + "Vie matematiku";
        System.out.println(Meno);
    }
    public static void ifElse2(boolean vieJavu, String Meno){
        if(vieJavu){
            Meno=Meno+"Vie Javu";
        }else
        {
            Meno=Meno+"Vie Matematiku";
        }
        System.out.println(Meno);
    }
     static void DnivTyzdni(int y){

        if(y==1){
            System.out.println("Pondelok");
        }
        else if(y==2){
            System.out.println("Utorok");
        }
        else if(y==3){
            System.out.println("Streda");
        }
        else if(y==4){
            System.out.println("Stvrtok");
        }
        else if(y==5){
            System.out.println("Piatok");
        }
        else if(y==6){
            System.out.println("Sobota");
        }
        else if(y==7){
            System.out.println("Nedela");
        }
        else if(y>7){
            System.out.println("Cislo neexistuje");
        }
    }
}
