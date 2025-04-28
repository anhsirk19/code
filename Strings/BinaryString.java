package Strings;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Strings/problem/binary-string-1587115620

public class BinaryString {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(solution(s));
    }
    //tc is o(n)
    //sc is o(1)
    static int solution(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                count++;
            }
        }
        return count * (count - 1)/2;
    }
}
