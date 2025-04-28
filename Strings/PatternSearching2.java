package Strings;

//improved naive solution, if pattern contains distinct elements

public class PatternSearching2 {
    public static void main(String[] args) {
        String text = "ABCABCDABCD";
        String pattern = "ABCD";
        solution(text, pattern);
    }
    //tc is o(n), o(n*m)
    //sc is o(1)
    static void solution(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        for(int i = 0 ; i <= n-m ; ){
            int j;
            for(j = 0 ; j < m ; j++){
                if(pattern.charAt(j) != text.charAt(i+j)){
                    break;
                }
            }
            if(j == m){
                System.out.println(i);
            }
            if(j == 0){
                i++;
            }else{
                i = i+j;
            }
        }
    }
}
