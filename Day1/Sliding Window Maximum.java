class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        if(arr.length==0) return new int[0];
        int[] arr=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            arr[i]=max;
        }
        return arr;
    }
}
