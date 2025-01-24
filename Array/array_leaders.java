class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        /*Brute force approach
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            boolean ele = true;
            for(int j=i+1; j<n; j++){
               if(arr[i] >= arr[j]){
                   continue;
               }else{
                   ele = false;
                   break;
               } 
            }
            if(ele == true){
                ans.add(arr[i]);
            }
        }
        return ans; */
        
        //optimised solution using single loop
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[n-1]);
        int maxm = arr[n-1];
        for(int i=n-2; i>=0; i--){
           int ele = arr[i];
           if(ele >= maxm){
               maxm = ele;
               ans.add(ele);
           }
            
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i= ans.size()-1; i>=0; i--){
            res.add(ans.get(i));
        }
        return res;
    }
}


// question - https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions