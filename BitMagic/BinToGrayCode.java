package BitMagic;

public class BinToGrayCode {
    public static void main(String[] args) {
        System.out.println(greyConverter1(10));
    }

    //tc is o(setbits in )
    public static int greyConverter(int n) {
        
        //find msb
        int org = n;
        
        int msb = 0;
        while(n != 0){
            msb = n;
            n = n & (n-1);//removes lsb
        }//here we have msb;
        System.out.println(msb);

        int i_bit;
        int i_1bit;
        for(int i = 0 ; i < 31 ; i++){
            i_bit = (org >> i) & 1;
            i_1bit = (org >> (i + 1)) & 1;
            
            msb = msb | ((i_bit ^ i_1bit) << i);
        }
        return msb;
    }

    //tc is o(1)
    public static int greyConverter1(int n) {
        return n ^ ( n >> 1);
    }
}
