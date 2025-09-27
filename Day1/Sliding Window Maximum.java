class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        if(nums.length==0) return new int[0];
        int[] arr=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,nums[j]);
            }
            arr[i]=max;
        }
        return arr;
    }
}
