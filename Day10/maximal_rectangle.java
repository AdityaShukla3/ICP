class Solution {
    public int maximalRectangle(char[][] arr) {
        int n=arr.length;
        int m=arr[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            int[] a=new int[m];
            for(int j=i;j<n;j++){
                for(int k=0;k<m;k++){
                    a[k]+=arr[j][k]-'0';
                }

                int h=j-i+1;
                int sum=0;
                for(int k=0;k<m;k++){
                    if(a[k]==h){
                        sum+=h;
                        ans=Math.max(ans,sum);
                    }
                    else sum=0;
                }
            }
        }
        return ans;
    }
}