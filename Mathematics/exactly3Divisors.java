package Mathematics;

import java.util.Arrays;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Mathematics/problem/exactly-3-divisors
public class exactly3Divisors {
    public static void main(String[] args) {
        answer1(100);
    }
    //naive appraoch
    static void answers(int n){
        for(int i = 1 ; i <= n ; i++){
            if(divisors(i) == 3){
                System.out.print(i + " ");
            }
        }
    }
    static int divisors(int n){
        if(n <= 0) return -1;
        int count = 0;
        for(int i = 1 ; i*i <= n ; i++){
            if(n%i == 0){
                count = count + 2;
                if(i == n/i){
                    count = count - 1;
                }
            }
        }
        return count;
    }

    //using sieve
    //tc is 0(nlognlogn) and auxilary space is o(n)

    static void answer1(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i = 2 ; i*i <= n ; i++){
            if(prime[i]){
                for(int j = i*i ; j <= n ; j = j + i){
                    prime[j] = false;
                }
            }
        }
        for(int k = 2 ; k*k <= n ; k++){
            if(prime[k]){
                System.out.print(k*k + " ");
            }
        }
    }

    //using constant space
}
