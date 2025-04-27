package Strings;

//to reverse a string

public class ReverseString {
    public static void main(String[] args) {
        String s = "krishna";
        System.out.println(reverse1(s));
    }
    //tc is o(n)
    //sc is o(n)
    static String reverse(String s){
        char[] arr = s.toCharArray();
        int l = 0;
        int h = s.length() - 1;
        while(l < h){
            char ch = arr[l];
            arr[l] = arr[h];
            arr[h] = ch;
            l++;
            h--;
        }
        return new String(arr);
    }
    //using string builder
    static String reverse1(String s){
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int h = s.length() - 1;
        while(l < h){
            char ch = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(h));
            sb.setCharAt(h, ch);
            l++;
            h--;
        }
        return new String(sb);
    }
}
