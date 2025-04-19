package Recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "malayalam";
        System.out.println(ispal(s, 0, s.length()-1));
    }

    //tc is o(n)
    //sc is o(n)
    static boolean ispal(String s, int start, int end){
        if(start >= end){
            return true;
        }

        return (s.charAt(start) == s.charAt(end)) && ispal(s, start+1, end-1);
    }
}
