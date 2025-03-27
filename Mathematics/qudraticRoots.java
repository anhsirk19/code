package Mathematics;

import java.util.ArrayList;

public class qudraticRoots {
    public static void main(String[] args) {
        ArrayList<Integer> ans = quadraticRoots(1, 1, 1);
        System.out.println(ans);
    }
    static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        int d = (b*b) - (4*a*c);
        ArrayList<Integer> list = new ArrayList<>();
        if(d < 0){
            System.out.print("Imaginary");
            return list;
        }else{
            double r1 = Math.floor(((-b) + Math.sqrt(d))/(2*a));
            double r2 = Math.floor(((-b) - Math.sqrt(d))/(2*a));
            list.add((int)Math.max(r1, r2));
            list.add((int)Math.min(r1, r2));
        }
        return list;
    }
}
