package QueueQ;


//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Queue/problem/circular-tour-1587115620

public class GasStation {
    public static void main(String[] args) {
        
    }

    //tc is o(n)
    //sc is o(1)
    public int startStation(int[] gas, int[] cost) {
        // Your code here
        int totalGas = 0;
        int totalCost = 0;
        
        int start = 0,  currGas = 0;
        for(int i = 0 ; i < gas.length ; i++){
            totalGas += gas[i];
            totalCost += cost[i];
            currGas = currGas + gas[i] - cost[i];
            if(currGas < 0){
                start = i+1;
                currGas = 0;
            }
        }
        return (totalGas < totalCost) ? -1 : start;
    }
}
