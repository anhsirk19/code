package Strings;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Strings/problem/the-modified-string-1587115621

public class ModifiedString {
    public static void main(String[] args) {
        String S = "aabbbcc";
        System.out.println(modified(S));
    }
    // Function to find minimum number of characters which Ishaan must insert
    // such that string doesn't have three consecutive same characters.
    //tc is o(n)
    //sc is o(1)

    public static long modified(String a) {
        // Your code here
        //search for 3 consecutive chars
        long count = 1;
        long ans = 0;
        
        for(int i = 1 ; i < a.length() ; i++){
            if(a.charAt(i) == a.charAt(i-1)){
                count++;
                if(count == 3){
                    ans++;
                    count = 1;
                }
            }else{
                count = 1;
            }
        }
        return ans;
    }
}
