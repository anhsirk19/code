package Strings;

//check if the string is palindrome or not

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "abcba";
        System.out.println(solution(s));
    }

    //two pointer approach
    //tc is o(n)
    //sc is o(1)
    static boolean solution(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
