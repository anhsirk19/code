package BitMagic;

//You are given a number n. Find the total count of set bits 
//for all numbers from 1 to n (both inclusive).

public class countTotalSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(17));
    }
    //tc is O(n)
    //it gives tle
    static int answer(int n){
        int count = 0;
        int[] tab = new int[256];
        tab[0] = 0;
        for(int i = 1 ; i <= 255 ; i++){
            tab[i] = tab[(i & (i-1))] + 1;
        }
        for(int i = 1 ; i <= n ; i++){
            count = count + tab[i & 255] + tab[(i >> 8) & 255] + tab[(i >> 16) & 255] + tab[(i >> 24) & 255];
            System.out.println(i + " -> " + count);
        }
        return count;
    }

    //by using pattern based approach
    //tc is o(1)

    public static int countSetBits(int n){
        n++;
        int res = 0;
        
        for(int i = 0 ; i < 30 ; i++){
            //find size of pattern 2^i+1
            int size = 1 << (i+1);
            
            res += (n/size) * (size/2);
            
            int rem = n%size;
            
            if(rem - size/2 > 0){
                res += rem - size/2;
            }
        }
        return res;
    }
}
