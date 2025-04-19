package Recursion;

public class print1toN {
    public static void main(String[] args) {
        answer(10);
    }
    static void answer(int n){
        if(n == 0){
            return;
        }
        answer(n-1);
        System.out.println(n);
    }
}
