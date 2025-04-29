package Strings;

//kmp algorithm for pattern search

public class PatternSearching4 {
    public static void main(String[] args) {
        String txt = "AAAAA";
        String pat = "AAA";
        System.out.println(kmp(txt, pat)); 
        
    }
    //tc is o(n), n = txt.len
    //sc is o(m), m = pat.len
    static boolean kmp(String txt, String pat){
        int n = txt.length();
        int m = pat.length();
        int[] lps = new int[m];
        findLps(pat, lps, m);//here we get the lps table

        //now iterate over tx
        int j = -1;//to iterate over lps
        int i = 0;//to iterate over the txt
        boolean flag = false;
        while(i < n && j < m-1){
            if(txt.charAt(i) == pat.charAt(j+1)){
                i++;
                j++;
                //if pat found
                if(j == m-1){
                    flag = true;
                    System.out.println(i-m + " ");
                    j = lps[j] - 1;
                }
            }else{
                if(j == -1){
                    i++;
                }else{
                    j = lps[j] - 1;
                }
            }
        }
        if(flag){
            return true;
        }
        return false;
    }

    static void findLps(String pat, int[] lps, int m){
        int i = 1;
        lps[0] = 0;
        int len = 0;
        while(i < m){
            if(pat.charAt(i) == pat.charAt(len)){
                lps[i++] = ++len;
            }else{
                if(len == 0){
                    lps[i++] = 0;
                }else{
                    len = lps[len - 1];
                }
            }
        }
    }
}

