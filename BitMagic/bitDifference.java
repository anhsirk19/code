package BitMagic;

public class bitDifference {
    public static void main(String[] args) {
        System.out.println(countBitsFlip(20, 25));
    }
    // O(number of set bits in (a ^ b))
    //Brian Kernighan’s algorithm 
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int xor = a ^ b;//it contains diff bits in both numbers
        //now count the setbits;
        int c = 0;
        while(xor != 0){
            xor = xor & (xor - 1);
            c++;
        }
        return c;
    }

    //using lookup table
    //tc is O(1)
    public static int countBitsFlip1(int a, int b){
        
        // Your code here
        int n = a ^ b;//it contains diff bits in both numbers
        //now count the setbits;
        int[] tab = new int[256];

        tab[0] = 0;

        //lookup table
        for(int i = 1 ; i <= 255 ; i++){
            tab[i] = tab[(i) & (i-1)] + 1;
        }

        return tab[n & 255] + tab[(n >> 8) & 255]
        + tab[(n >> 16) & 255] + tab[(n >> 24) & 255];
    }

}
