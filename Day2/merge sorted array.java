class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int last=arr1.length-1;
        while(n>0 && m>0)
        {
            if(arr2[n-1]>=arr1[m-1])
            {
                arr1[last]=arr2[n-1];
                n--;
            }
            else
            {
                arr1[last]=arr1[m-1];
                m--;
            }
            last--;
        }
        while(n>0)
        {
            arr1[last]=arr2[n-1];
            last--;
            n--;
        }

    }
}
