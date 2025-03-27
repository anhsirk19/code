package Mathematics;

public class cToFahrenheit {
    public static void main(String[] args) {
        System.out.println(cToF(25));
    }
    static double cToF(int C)
    {
        return (C * 1.8) + 32;
    }
}
