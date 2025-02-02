class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        int n = arr.length;
        ArrayList<Integer> ans =  new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int ele = arr[i];
            while(st.size()>0 && ele >= arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                ans.add(i+1);
                }else{
                    ans.add(i-st.peek());
                }
            st.push(i);
        }
        return ans;
    }
}

// https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1?page=2&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions