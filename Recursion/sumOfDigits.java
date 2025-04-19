package Recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1236890010));
    }

    //So, Time Complexity = O(d) where d is the number of digits in n.
    //(Alternatively, O(log₁₀(n)) if you're analyzing with respect to the magnitude of n.)

    //So, Space Complexity = O(d) due to the recursion stack.
    //(Again, d = number of digits in n, or O(log₁₀(n)))

    public static int sumOfDigits(int n)
    {
        if(n/10 == 0){
            return n;
        }
        return (n%10) + sumOfDigits(n/10);
    }
}
