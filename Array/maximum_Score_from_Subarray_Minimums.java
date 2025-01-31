class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n-1;i++){
            int sum = arr[i]+arr[i+1];
            ans = Math.max(sum,ans);
        }
        return ans;
    }
}


//https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/1