class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        // //brute force approach
        // int n = arr.length;
        // int maxm = Integer.MIN_VALUE;
        // for(int i=0; i<n; i++){
        //     int sum = arr[i];
        //     for(int j=i+1; j<n; j++){
        //       sum += arr[j];
        //       if(sum > maxm){
        //           maxm = sum;
        //       }
        //     }
        // }
        // return maxm;
        
        //optimised approach
        int n =arr.length, sum=0;
        int maxm = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
           sum += arr[i];
           if(sum > maxm ){
               maxm = sum;
           }
           if(sum < 0){
               sum = 0;;
           }
        }
        return maxm;
    }
}

//https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
