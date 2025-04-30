package Strings;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Strings/problem/maximum-occuring-character-1587115620

public class MostFrequentChar {
    public static void main(String[] args) {
        String s = "testsample";
        System.out.println(getMaxOccuringChar(s));
    }

    public static char getMaxOccuringChar(String s) {
        // Your code here
        int[] arr = new int[26];
        char maxChar = s.charAt(0);
        int maxCount = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            arr[index]++;
            if(arr[index] > maxCount){
                maxChar = s.charAt(i);
                maxCount = arr[index];
            }
            if(arr[index] == maxCount){
                if(ch < maxChar){
                    maxChar = ch;
                }
            }
        }
        return maxChar;
    }
}
