package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(20));
    }

    //tc is o(2^n)
    //sc is o(n)
    static int fibonacci(int n)
    {
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
