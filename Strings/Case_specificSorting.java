package Strings;

import java.util.Arrays;

public class Case_specificSorting {
    public static void main(String[] args) {
        String str = "defRTSersUXI";
        System.out.println(caseSort(str));
    }

    public static String caseSort(String str) {
        // Your code here
        StringBuilder l = new StringBuilder();
        StringBuilder u = new StringBuilder();
        
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(isLowerChar(ch)){
                l.append(ch);
            }else{
                u.append(ch);
            }
        }
        
        char[] lArr = new char[l.length()];
        l.getChars(0, l.length(), lArr, 0);
        char[] uArr = new char[u.length()];
        u.getChars(0, u.length(), uArr, 0);
        char[] ans = new char[str.length()];
        Arrays.sort(lArr);
        Arrays.sort(uArr);
        int i = 0, j = 0, k = 0;
        while(k < str.length()){
            char ch = str.charAt(k);
            if(isLowerChar(ch)){
                ans[k] = lArr[i++]; 
            }else{
                ans[k] = uArr[j++];
            }
            k++;
        }
        String s = String.valueOf(ans);
        return s;
    }
    static boolean isLowerChar(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return true;
        }
        return false;
    }
}
