package Strings;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Strings/problem/implement-strstr

public class FirstOccurence {
    public static void main(String[] args) {
        String txt = "GeeksForGeeks";
        String pat = "For";
        System.out.println(firstOccurence(txt, pat));
    }

    static int firstOccurence(String txt, String pat) {
        // in-built function
        //return txt.indexOf(pat);
        int n = txt.length();
        int m = pat.length();
        if(m > n){
            return -1;
        }
        for(int i = 0 ; i <= n-m ; i++){
            int j = 0;
            for(j = 0 ; j < m ; j++){
                if(txt.charAt(i+j) != pat.charAt(j)){
                    break;
                }
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
}
