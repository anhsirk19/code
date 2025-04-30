package Strings;

public class Panagram {
    public static void main(String[] args) {
        String s = "Bawds jog, flick quartz, vex nymph";
        System.out.println(checkPangram(s));
    }
    //tc is o(n)
    //sc is o(26) = o(1)
    public static boolean checkPangram(String s) {
        // your code here
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= 97 && ch <= 122){//lowercase
                arr[ch - 'a']++;
            }
            if(ch >= 65 && ch <= 90){//uppercase
                arr[ch - 'A']++;
            }
        }
        for(int i = 0 ; i < 26 ; i++){
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
