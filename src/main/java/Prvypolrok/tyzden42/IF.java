package Prvypolrok.tyzden42;

public class IF {
    public static void main(String[] args) {
        Meno("Tomas");
    }

    static void Meno(String dlzkaMena)
    {
        if (dlzkaMena.length()>15)
        {
            System.out.println("Moje meno je vacsie ako 15");
        }
        else {
            System.out.println("Moje meno je mensie ako 15");
        }
    }
}
