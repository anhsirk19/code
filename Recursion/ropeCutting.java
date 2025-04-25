package Recursion;

//https://www.geeksforgeeks.org/batch/interview-101-21/track/DSASP-Recursion/article/ODUyMA%3D%3D

//Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C. 
//The task is to maximizes the number of cuts in rope. 
//If it is impossible to make cut then print the number else print -1. 

public class ropeCutting {
    public static void main(String[] args) {
        
    }

    static int answer(int n, int a, int b, int c){
        if(n < 0){
            return -1;
        }
        if(n == 0){
            return 0;
        }
        answer(n-a, a, b, c);
        answer(n-b, a, b, c);
        answer(n-c, a, b, c);
    }
}
