package BitMagic;

public class countSetBits {
    public static void main(String[] args) {
        System.out.println(answer3(19));
    }
    //naive
    static int answer(int n){
        int x = 1;
        int count = 0;
        while(x <= n){
            if((n & x) != 0){
                count++;
            }
            x = 2*x;
        }
        return count;
    }
    static int answer1(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
    //
    static int answer2(int n){
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    //abouce solutions hava time complexity of theeta(d), d=no. of bits
    //using (brian kerningums algo)
    //theeta(set bits)
    static int answer3(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

}
