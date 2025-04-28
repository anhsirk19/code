package Strings;

//q
//check if str1 is a sunsequence of str2

public class SubSequence {
    public static void main(String[] args) {
        String str1 = "AXY";
        String str2 = "ADXCPYI";
        System.out.println(solution(str1, str2));
        System.out.println(isSub(str1, str2, 3, 7));
    }
    //tc is o(m), m = s2.len as s1 < s2
    //sc is o(m), atmost m stack calls
    
    static boolean isSub(String s1, String s2, int n, int m){
        if(n > m){
            return false;
        }
        if(n == 0){
            return true;
        }
        if(m == 0){
            return false;
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return isSub(s1, s2, n-1, m-1);
        }else{
            return isSub(s1, s2, n, m-1);
        }
    }
    //tc is o(m), m = s2.len as s1 < s2
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
