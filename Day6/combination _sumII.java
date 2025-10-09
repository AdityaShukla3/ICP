class Solution {
    static void helper(List<List<Integer>> ans,List<Integer> list,int[] arr,int sum,int idx,int t){
        if(sum==t){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum>t) return;

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
            list.add(arr[i]);
            helper(ans,list,arr,sum+arr[i],i+1,t);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        int n=candidates.length;
        Arrays.sort(candidates);
        helper(ans,list,candidates,0,0,target);

        return ans;
    }
}