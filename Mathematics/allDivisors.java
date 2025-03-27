package Mathematics;

public class allDivisors {
    public static void main(String[] args) {
        answer2(176);
    }

    //naive approach
    //o(n)
    static void answer(int n){
        if( n <= 0) return;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    //o(sqrtn)
    static void answer1(int n){
        if(n <= 0) return;
        for(int i = 1 ; i*i <= n ; i++){
            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }

    //o(sqrtn)
    static void answer2(int n){
        if(n <= 0) return;
        int count = 0;
        for(int i = 1 ; i*i < n ; i++){
            if(n%i == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        for(int i = (int)Math.sqrt(n) ; i <= n ; i++){
            if(n%i == 0){
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.print(count);
    }
}
