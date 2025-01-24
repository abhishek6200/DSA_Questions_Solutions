
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashSet<Integer> dummy = new HashSet<>();
        for(int i=0; i<a.length; i++){
            dummy.add(a[i]);
        }
        boolean ans = true;
        //checking for subset
        for(int i=0; i<b.length; i++){
            int ele = b[i];
            if(!dummy.contains(ele)){
                ans = false;
                break;
            }
        }
        return ans;
    }
}

//https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions