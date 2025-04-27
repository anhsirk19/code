package Strings;

//to reverse a string
//Reverse words in a given sentence in Java

public class ReverseSentence {
    public static void main(String[] args) {
        String s = "Welcome to Gfg";
        System.out.println(s);
        System.out.println(reverseSentence(s));
        System.out.println(reverseSentence1(s));
    }

    //tc is o(n), sc is o(n)

    static String reverseSentence(String s){
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        for(int end = 0 ; end < s.length() ; end++){
            if(sb.charAt(end) == ' '){
                reverseWord(sb, start, end - 1);
                start = end + 1;
            }
        }
        reverseWord(sb, start, s.length() - 1);
        reverseWord(sb, 0, s.length() - 1);
        return new String(sb);
    }

    static void reverseWord(StringBuilder sb, int l, int h){
        while(l < h){
            char ch = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(h));
            sb.setCharAt(h, ch);
            l++;
            h--;
        }
    }

    //tc is o(n), sc is o(n)

    static String reverseSentence1(String s){
        StringBuilder ans=new StringBuilder();
         
        String temp = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                if(!temp.equals(""))
                {
                    ans.insert(0,temp+" ");
                }
                 
                temp = "";
            }
            else
                temp += ch;
        }
        ans.insert(0,temp+" ");
       
        return ans.toString().substring(0,ans.length()-1);
    }
}
