package Mathematics;

public class gcd {
    public static void main(String[] args) {
        System.out.println(answer(100, 200));
        System.out.println(answer1(100, 200));
    }
    //naive approach o(min(a, b))
    static int answer(int a, int b){
        int res = Math.min(a, b);
        while(res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;
        }
        return res;
    }
    //using optimised euclidean algo
    //o(log(min(a,b)))
    static int answer1(int a, int b){
        if(b == 0){
            return a;
        }
        return answer1(b, a%b);
    }
}
