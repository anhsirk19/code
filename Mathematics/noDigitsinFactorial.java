package Mathematics;

public class noDigitsinFactorial {
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(120));
    }
    static int digitsInFactorial(int N){
        // code here
        if(N < 0){
            return 0;
        }
        
        if(N <= 1){
            return 1;
        }
        double ans = 0;
        for(int i = 2 ; i <= N ; i++){
            ans = ans + Math.log10(i);
        }
        return (int)Math.floor(ans) + 1;
    }
}
