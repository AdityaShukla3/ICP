class Solution {
    static void helper(List<Integer> list,List<List<Integer>> ans,int[] arr,int k,int idx){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            list.add(arr[i]);
            helper(list,ans,arr,k,i+1);
            list.remove(list.size()-1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }        
        helper(list,ans,arr,k,0);
        return ans;
    }
}