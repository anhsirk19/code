package Mathematics;

public class countDigits{
    public static void main(String[] args) {
        int n = 109020;
        System.out.println(count(n));
        System.out.println(count1(n));
    }
    //using recursion
    static int count(int n){
        if(n/10 == 0){
            return 1;
        }
        return 1 + count(n/10);
    }
    static int count1(int n){
        int digits = 0;
        while(n != 0){
            n = n/10;
            digits++;
        }
        return digits;
    }
}