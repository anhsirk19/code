import java.util.ArrayList;
import java.util.Arrays;

public class reverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));
        reverseInGroups(list, 3);
        System.out.println(list);
    }

    static void reverseInGroups(ArrayList<Long> arr, int k) {
        for(int i = 0 ; i < arr.size() ; i = i+k){
            int low = i;
            int high =  Math.min(i+k-1, arr.size()-1);
            while(low < high){
            long temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;
            }
        }
    }
}
