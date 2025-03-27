package Mathematics;

public class lcm {
    public static void main(String[] args) {
        System.out.println(answer1(4, 6));
        System.out.println(answer2(4, 6));

    }
    //naive approac tc i o(a*b -max(a, b))
    static int answer1(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res % a == 0 && res % b == 0){
                return res;
            }
            res++;
        }
    }
    //using formula lcm*gcd = a*b
    // O(log(min(a,b))
    static int answer2(int a, int b){
        return (a*b)/gcd(a, b);
    }
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    //without recursion
    static int gcd1(int a, int b){
        while(b != 0){
            int temp = b;
            b = b%a;
            a = temp;
        }
        return a;
    }
}
