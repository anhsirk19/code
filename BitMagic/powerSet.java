package BitMagic;
//For example S = {a, b, c} then P(s) = {{}, {a}, {b}, {c}, {a,b}, {a, c}, {b, c}, {a, b, c}}.
public class powerSet {
    public static void main(String[] args) {
        String s = "abc";
        answer(s);
    }
    static void answer(String s){
        int n = s.length();
        int pow2 = (int)Math.pow(2, n);
        for(int i = 0 ; i < pow2 ; i++){
            for(int j = 0 ; j < n ; j++){
                if((i & (1<<j)) != 0){        //here(1 << j) checks the set bit//
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
