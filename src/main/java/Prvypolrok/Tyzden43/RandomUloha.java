package Prvypolrok.Tyzden43;

public class RandomUloha {
    public static void main(String[] args) {
    int[] pole = new int[]{1,64,80,3,5,7};
    priemer(pole);
    }
    static double priemer(int[] pole) {
        double vys = 0;
        for (int x = 0; x < pole.length; x++)

        {

            vys = vys + pole[x];

        }
        vys = vys/pole.length;
        System.out.println(vys);
        return vys;

    }
}

