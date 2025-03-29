package Mathematics;

public class gpTerm {
    public static void main(String[] args) {
        System.out.println(termOfGP(1, 2, 5));
    }
    static double termOfGP(int A,int B,int N)
    {
        double r = (double)B/A;//integer division
        double ans = A*power(r, N-1);
        return ans;
    }
    static double power(double x, int n){
        double res = 1;
        while(n > 0){
            if(n % 2 != 0){
                res = res * x;
            }
            x = x*x;
            n = n/2;
        }
        return res;
    }
}
