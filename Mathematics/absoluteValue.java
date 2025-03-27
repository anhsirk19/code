package Mathematics;
//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Mathematics/problem/absolute-value
public class absoluteValue {
    public static void main(String[] args) {
        System.out.println(absolute(-32));
    }
    static int absolute(int I) {
        return (I < 0) ? -I : I;
    }
}
