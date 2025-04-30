package Strings;

//naive pattern seraching algo
public class PatternSearching1 {
    public static void main(String[] args) {
        String text = "ABABABCDABAB";
        String pattern = "ABAB";
        solution(text, pattern);
    }
    //tc is O((n-m+1)*m)
    //sc is o(1)
    static void solution(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        for(int i = 0 ; i <= n-m ; i++){
            int count = 0;
            for(int j = 0 ; j < m ; j++){
                if(text.charAt(j + i) == pattern.charAt(j)){
                    count++;
                }
            }
            if(count == m){
                    System.out.print(i + " ");
            }
        }
    }
}
