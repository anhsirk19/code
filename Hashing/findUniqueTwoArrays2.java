import java.util.Arrays;
import java.util.HashSet;

//find the unique elements in the intersection of both arrays

public class findUniqueTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {7,1,5,2,3,6};
        int[] arr2 = {3,8,6,20,7,3};
        System.out.println(answer(arr1, arr2));
        System.out.println(answer1(arr1, arr2));
    }

    //naive approach
    //tc is o(nlogn + mlogm + min(n + m) )
    //sc is o(1)
    static int answer(int[] arr1, int[] arr2){
        int count = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while(i < arr1.length && j < arr2.length){   //o(min(n, m))
            if(arr1[i] == arr2[j]){
                count++;i++;j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return count;
    }

    //using set
    //tc is o(n + m)
    //sc is o(n)
    static int answer1(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();// create set for smaller array is preferable
        for(int ele : arr1){
            set.add(ele);
        }
        int count = 0;
        for(int ele : arr2){
            if(set.contains(ele)){
                count++;
                set.remove(ele);//what if arr2 contains duplicate ele which is  present in set. so, remove it.
            }
        }
        return count;
    }
}
