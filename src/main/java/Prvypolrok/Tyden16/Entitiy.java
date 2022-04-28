package Prvypolrok.Tyden16;

public class Entitiy {
    private String meno;
    private int vek;
    private int vyska;

    public Entitiy(){}
    public Entitiy(String meno, int vek,int vyska){
        this.meno = meno;
        this.vek = vek;
        this.vyska=vyska;
    }
    public String getMeno(){
        return meno;
    }
    public void setMeno(String meno){
        this.meno=meno;
    }

    public int getVek(){
        return vek;
    }
    public void setVek(int vek){
        this.vek=vek;
    }
    public int getVyska(){
        return vyska;
    }
    public void setVyska(int vyska){
        this.vyska=vyska;
    }
}
