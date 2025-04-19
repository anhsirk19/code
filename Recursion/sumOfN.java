package Recursion;

public class sumOfN {
    public static void main(String[] args) {
        System.out.println(answer(6));
    }
    //tc is o(n)
    //sc is o(n)
    static int answer(int n){
        if(n == 0){
            return 0;
        }
        return n + answer(n-1);
    }
}
