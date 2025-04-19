package Recursion;

class printNto1 {

    public static void main(String[] args) {
        solution(5);
    }
    static void solution(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        solution(n-1);
    }
    
}