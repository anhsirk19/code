import java.util.ArrayList;

public class leadersInArray {
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(nums));
    }
    //tc is o(n),
    //sc is o(1)
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int rightMax = arr[n-1];
        list.add(rightMax);
        for(int i = n-2; i >= 0 ; i--){
            if(arr[i] >= rightMax){
                rightMax = arr[i];
                list.add(0,rightMax);
            }
        }
        return list;
    }
}
