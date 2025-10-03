class Solution {
    static void helper(int a,List<List<Integer>> ans,List<Integer> list,int k,int n){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=1;i<=n;i++){
            list.add(i);
            helper(i+1,ans,list,k,n);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(1,ans,list,k,n);
        return ans;
    }
}