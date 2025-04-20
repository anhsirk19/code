package Recursion;

//to return the number of digits in n

public class countDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(12309010));
    }

    //Time Complexity & space = O(d)
    //or O(log₁₀(n)), since d ≈ log₁₀(n)
    public static int countDigits(int n) {
        // add your code here
        if(n/10 == 0){
            return 1;
        }
        return 1 + countDigits(n/10);
    }
}
