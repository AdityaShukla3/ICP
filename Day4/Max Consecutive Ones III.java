class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int start=0;
        int end=0;
        int c=0;
        int ans=0;

        while(end<n){
            if(arr[end]==0) c++;
            end++;
            while(start<end && c>k){
                if(arr[start]==0) c--;
                start++;
            }
            ans=Math.max(ans,end-start);
        }
        return ans;
    }
}