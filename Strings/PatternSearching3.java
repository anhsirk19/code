package Strings;

//rabin krap algorithm
//pattern searching
//used to find diff patterns in files, notes

public class PatternSearching3 {
    public static void main(String[] args) {
        String S = "aabaacaadaabaaba";
        String P = "aaba";
        solution(S, P);
    }
    static int d = 256;
    //tc is o((n-m+1) * m)
    //sc is o(1)
    static void solution(String txt, String pat){
        // Your code here
        //find pow(d, m-1); value

        int n = txt.length();
        int m = pat.length();
        int h = 1;
        int q = 101;//large prime, used to decrease collisions
        
        for(int i = 0 ; i < m-1 ; i++){
            h = (h * d)%q;
        }
        
        //find the patternHashVal and initial txtWindowHashVal of size m;
        int p = 0, t = 0;
        for(int i = 0 ; i < m ; i++){
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }
        
        //now iterate over the txt
        for(int i = 0 ; i <= n-m ; i++){
            if(p == t){
                //now check the char to char in this window m
                int j = 0;
                for(j = 0 ; j < m ; j++){
                    if(pat.charAt(j) != txt.charAt(i+j)){
                        break;
                    }
                }
                if(j == m){
                    System.out.println(i);
                }
            }
            if(i < n-m){
                t = (d*(t - txt.charAt(i)*h) + txt.charAt(i+m))%q;
                if(t < 0){
                    t = t + q;
                }
            }
        }
    }
}
