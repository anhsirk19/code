import java.util.ArrayList;
import java.util.List;

public class printPattern {
    public static void main(String[] args) {
        System.out.println(answer(16));
    }

    static List<Integer> answer(int N){
        int orginal = N;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(N);
        while(N > 0){
            N -= 5;
            list.add(N);
        }
        while(N < orginal){
            N += 5;
            list.add(N);
        }
        return list;
    }
}