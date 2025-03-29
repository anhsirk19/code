package Mathematics;

public class primeFactors {
    public static void main(String[] args) {
        int n = 450;
        answer1(n);

    }

    // naive
    // o(n*sqrtn*logn)
    static void answer1(int n) {
        if (n <= 1)
            return;
        for (int i = 2; i <= n; i++) {
            if (isPrime2(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }

    //efficient solution
    static void answer2(int n) {
        if (n <= 1)
            return;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n > 1) {
            System.out.print(n);
        }
    }

    //more efficient solution
    //o(sqrt(n))
    static void answer3(int n){
        if(n <= 1) return;
        while(n % 2 == 0){
            System.out.print(2 + " ");
        }
        while(n % 3 == 0){
            System.out.print(3 + " ");
        }
        for(int i = 5; i*i <= n ; i=i+6){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n/i;
            }
            while(n % (i+2)== 0){
                System.out.print(i+2 + " ");
                n = n/(i+2);
            }
        }
        if(n > 3){
            System.out.print(n);
        }
    }

    // sqrt(n)
    //
    static boolean isPrime2(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
