package BitMagic;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-BitMagic/problem/swap-all-odd-and-even-bits-1587115621

public class swapODDEvenBits {
    public static void main(String[] args) {
        System.out.println(swapBits1(23));
    }
    //it may give tle
    public static int swapBits(int n) 
    {
	    for(int i = 0 ; i < 32 ; i = i+2){
	        int i_bit = (n >> i) & 1;
	        int i_1bit = (n >> (i+1)) & 1;
	        n = n - (i_bit << i) - (i_1bit << (i+1));//delete ith bit and i+1th bit
	        n = n + (i_bit << (i+1)) + (i_1bit << i);//add ith bit at i+1, and i+1bit at i
	    }
	    return n;
	}
    //tc is o(1)
    //sc is o(1)
    //efficient approach
    public static int swapBits1(int n) 
    {
	    // Your code
	    int even_bitMask = 0xAAAAAAAA;
	    int odd_bitMask = 0x55555555;
	    int even_bits = n & even_bitMask;
	    int odd_bits = n & odd_bitMask;
	    
	    even_bits >>= 1;
	    odd_bits <<= 1;
	    
	    return (even_bits) | (odd_bits);
	}
}
