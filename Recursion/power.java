package Recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(RecursivePower1(3,5));
    }
    //tc is o(p)
    //sc is o(p)
    static int RecursivePower(int n,int p)
    {
        if(p == 0){
            return 1;
        }
        return n * RecursivePower(n, p-1);
    }
    //tc is o(logp)
    //sc is o(logp)
    static int RecursivePower1(int n,int p)
    {
        // add your code here
        if(p == 0){
            return 1;
        }
        int temp = RecursivePower(n, p/2);
        if(p % 2 == 0){
            return temp*temp;
        }else{
            return n * temp * temp;
        }
    }
}
