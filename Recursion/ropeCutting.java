package Recursion;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Recursion/article/ODUyMA%3D%3D

//Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C. 
//The task is to maximizes the number of cuts in rope. 
//If it is impossible to make cut then print the number else print -1. 

public class ropeCutting {
    public static void main(String[] args) {
        int n = 5, a = 2, b = 1, c = 5;
    	
    	System.out.println(answer(n, a, b, c));
    }

    static int answer(int n, int a, int b, int c){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 0;
        }
        int res = Math.max(answer(n-a, a, b, c), Math.max(answer(n-b, a, b, c), answer(n-c, a, b, c)));
        if(res == -1){
            return res;
        }
        return res + 1;

    }
}
