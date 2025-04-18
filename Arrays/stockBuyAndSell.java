//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Arrays/problem/stock-buy-and-sell-1587115621

public class stockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockBuySell(arr));
    }

    static int stockBuySell(int arr[]) {
        // code here
        int profit = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i] - arr[i-1];
            }
        }
        return profit;
    }
}
