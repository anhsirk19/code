package Mathematics;
//to find trailing zeroes in factorial of a number
public class trailingZeros {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(countZero(n));
        System.out.println(countZero1(251));
    }
    //naive approach
    static int countZero(int n){
        int fact = 1;
        for(int i = 2 ; i <= n ; i++){
            fact = fact*i;
        }
        int res = 0;
        while(fact % 10 == 0){
            res++;
            fact = fact/10;
        }
        return res;
    }//tc is o(n), but overflow happens bcause of factorial

    //o(logn)
    static int countZero1(int n){
        int count = 0;
        for(int i = 5 ; i < n ; i = i*5){
            count = count + n/i;
        }
        return count;
    }
}
