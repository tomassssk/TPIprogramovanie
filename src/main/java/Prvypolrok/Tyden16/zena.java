package Prvypolrok.Tyden16;

public class zena extends  Entitiy{
    private final String pohlavie = "Zena";


    public zena(){}

    public zena(int vek,String meno,int vyska){
        super(meno,vek,vyska);
    }

    public String getPohlavie(){
        return pohlavie;
    }

}
