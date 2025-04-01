package BitMagic;
//check if kth bit is set or not
public class kthSet {
    public static void main(String[] args) {
        System.out.println(answer3(11, 1));
    }
    //naive 1
    static boolean answer(int n, int k){
        int x = 1;
        for(int i = 0 ; i < k-1 ; i++){
            x = 2*x;
        }
        if((x&n) != 0){
            return true;
        }
        return false;
    }
    //naive 2
    static boolean answer1(int n, int k){
        for(int i = 0 ; i < k-1 ; i++){
            n = n/2;
        }
        if((n&1) != 0){
            return true;
        }
        return false;
    }
    //efficient method 1
    static boolean answer2(int n, int k){
        int x = 1 << (k-1);
        
        if((x&n) != 0){
            return true;
        }
        return false;
    }
    //efficient method 2
    static boolean answer3(int n, int k){
        n = n >> k-1;

        if((1&n) != 0){
            return true;
        }
        return false;
    }

}
