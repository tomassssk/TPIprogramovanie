package Prvypolrok.Tyden16;

public class muz extends Entitiy{
    private final String pohlavie = "Muz";


    public muz() {
    }
    public muz(int vek,String meno,int vyska){
        super(meno,vek,vyska);
    }

    public String getPohlavie() {
        return pohlavie;

    }
}

