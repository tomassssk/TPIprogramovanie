package Prvypolrok.tyzden12;

public class Konstruktori {
    public static void main(String[] args) {

        Pes MinkoTiminko =  new Pes("Rottwailer","Pes",4,"Pato");
        Pes MinkoPatinko =  new Pes("Labrador","Pes",9,"Stano");
        Pes Jozinka =  new Pes("Stafford","Fena",5,"Timo");

        MinkoTiminko.pessahra();
        MinkoPatinko.pessahra();
        Jozinka.pessahra();

        MinkoTiminko.hrajusaspolu(MinkoPatinko);
        MinkoPatinko.hrajusaspolu(Jozinka);

    }
}
