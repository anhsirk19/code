package Strings;

//Given a string str containing alphanumeric characters. 
//The task is to calculate the sum of all the numbers present in the string.

public class SumOfNumStr {
    public static void main(String[] args) {
        String s = "1abc23";
        System.out.println(findSum(s));
    }
    //tc is o(n)
    //sc is o(1)
    public static int findSum(String s) {
        // your code here
        int ans = 0;
        int temp = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch <= 57){
                temp = temp*10 + (ch - 48);
            }else{
                ans += temp;
                temp = 0;
            }
        }
        ans += temp;
        return ans;
    }
}
