package Mathematics;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n value:");
        int n = in.nextInt();
        System.out.println(fact(n));
        System.out.println(fact1(5));
        in.close();

    }
    //using iterative approach O(n)
    static int fact(int n){
        int ans = 1;
        if(n == 0){
            return 1;
        }
        for(int i = 2 ; i <= n ; i++){
            ans = ans*i;
        }
        return ans;
    }
    //usin recursive approach theta(n)
    static int fact1(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact1(n-1);
    }
}
