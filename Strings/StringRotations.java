package Strings;

public class StringRotations {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(areRotations(s1, s2));
    }
    //tc is o(n*m)
    //sc is o(n)
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        String temp = s1 + s1;
        return temp.contains(s2);
    }

    //this only satisfy when the strings has distinct characters
    //tc is o(n)
    //sc is o(1)
    public static boolean areRotations9(String s1, String s2) {
        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        int n = s1.length();
        char firstChar = s1.charAt(0);
        int t = -1;
        for(int i = 0 ; i < n ; i++){
            if(s2.charAt(i) == firstChar){
                t = i;
                break;
            }
        }
        if(t == -1){
            return false;
        }
        int i = 0;
        for(i = 0 ; i < n ; i++){
            if(s1.charAt(i) != s2.charAt((i + t) % n)){
                return false;
            }
        }
        return true;
    }
}
