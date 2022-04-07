package Prvypolrok.tyzden12;

public class Pes {

    private String rasa;
    private String pohlavie;
    private double vek;
   private String meno;

    public Pes(String rasa,String pohlavie,double vek,String meno){

        this.rasa=rasa;
        this.pohlavie=pohlavie;
        this.vek=vek;
        this.meno=meno;
    }

    public  void pessahra(){
       if(vek>8){
           System.out.println(meno + " nehra sa  ");
       }
       else{
           System.out.println(meno + " hra sa ");
       }
    }

    public void setVek(double vek) {
        this.vek = vek;
    }

    public void hrajusaspolu(Pes psik){

        if(psik.pohlavie=="Fena"){

            System.out.println(meno + " sa hra  s " + psik.meno);
        }
        else{

            System.out.println(meno + " pokusal "+ psik.meno);
        }
    }

    public double getVek(){
        return vek;
    }

    public String getPohlavie(){
        return pohlavie;
    }

    public String getRasa() {
        return rasa;
    }

    public String getMeno() {
        return meno;
    }

    @Override
    public String toString() {
        return "Pes{" +
                "rasa='" + rasa + '\'' +
                ", pohlavie='" + pohlavie + '\'' +
                ", vek=" + vek +
                ", meno='" + meno + '\'' +
                '}';
    }
}
