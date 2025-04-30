package Strings;

public class MinimumIndexedChar {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "set";
        System.out.println(minIndexChar(s1, s2));
    }
    //tc is o(n*m)
    //sc is o(1)
    public static int minIndexChar(String s1, String s2) {
        // Your code here
        for(int i = 0 ; i < s1.length() ; i++){
            char ch = s1.charAt(i);
            for(int j = 0 ; j < s2.length() ; j++){
                if(s2.charAt(j) == ch){
                    return i;
                }
            }
        }
        return -1;
    }
    //as it only contians lowercase leters
    //tc is o(n + m)
    //sc is o(1)
    public static int minIndexChar1(String s1, String s2) {
        // Your code here
        int[] arr = new int[26];
        for(int i = 0 ; i < s2.length() ; i++){
            arr[s2.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s1.length() ; i++){
            if(arr[s1.charAt(i) - 'a'] != 0){
                return i;
            }
        }
        return -1;
    }
}
