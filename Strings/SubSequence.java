package Strings;

//q
//check if str1 is a sunsequence of str2

public class SubSequence {
    public static void main(String[] args) {
        String str1 = "AXY";
        String str2 = "ADXCPYI";
        System.out.println(solution(str1, str2));
    }
    //tc is o(n)
    //sc is o(1)
    static boolean solution(String s1, String s2){
        if(s1.length() > s2.length()){
            return false;
        }
        int k = 0;//for s1
        for(int i = 0 ; i < s2.length() && k < s1.length(); i++){//it can rise index out of exception for k, so added k < s1.len
            if(s1.charAt(k) == s2.charAt(i)){
                k++;
            }
        }
        if(k == s1.length()){
            return true;
        }
        return false;
    }
}
