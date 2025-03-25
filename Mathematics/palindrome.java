package Mathematics;

public class palindrome {
    public static void main(String[] args) {
        int n = -99199;
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n) {
        int org = n;
        int rev = 0;
        while (n != 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;
            n = n / 10;
        }
        if (rev == org) {
            return true;
        }
        return false;
    }
}
