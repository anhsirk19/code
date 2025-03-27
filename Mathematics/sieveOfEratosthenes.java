package Mathematics;

import java.util.Arrays;

//to find primes below n 
public class sieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50;
        answer4(n);
    }

    //naive approach
    //tc is o(n*sqrt(n))
    static void answer(int n){
        for(int i = 2; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    //sieve method
    //tc is o(n*log(log(n)))
    //as is o(n)
    static void answer2(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i = 2; i*i <= n ; i++){
            if(prime[i]){
                for(int j = 2*i ; j <= n ; j = j + i){
                    prime[j] = false;
                }
            }
        }
        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
    }
    //optimised sieve replace i*i with 2*i
    static void answer3(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i = 2; i*i <= n ; i++){
            if(prime[i]){
                for(int j = i*i ; j <= n ; j = j + i){
                    prime[j] = false;
                }
            }
        }
        for(int i = 2 ; i <= n ; i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
    }

    //further optimisation
    static void answer4(int n){
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);
        for(int i = 2; i <= n ; i++){
            if(prime[i]){
                System.out.print(i + " ");
                for(int j = i*i ; j <= n ; j = j + i){
                    prime[j] = false;
                }
            }
        }
    }

    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i = 5 ; i*i <= n ; i = i+6){
            if(n%i == 0 || n % (i+2) == 0){
                return false;
            }
        }
        return true;
    }
}
