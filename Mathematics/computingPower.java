package Mathematics;

public class computingPower {
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
    //o(n) 
    static int compute(int x, int n){
        int res = 1;
        while(n != 0){
            res = res*x;
            n--;
        }
        return res;
    }
    //using recursin
    //tc is o(logn)
    //sc is o(logn)
    static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int temp = power(x, n/2);
        if(n%2 == 0){
            return temp*temp;
        }
        return x*temp*temp;
    }
}
