class Solution {

    public int uniquePaths(int m, int n) {
        int c=helper(m,n,0,0);
        return c;

    }

    static int helper(int m,int n,int cr,int cc){
        if(cr==m-1 && cc==n-1){
            return 1;
        }
        int[] dr={0,1};
        int[] dc={1,0};
        int c=0;
        for(int i=0;i<2;i++){
            int nbr=cr+dr[i];
            int nbc=cc+dc[i];
            if(isValid(nbr,nbc,m,n)){
                c+=helper(m,n,nbr,nbc);
            }
        }
        return c;
    }

    static boolean isValid(int cr,int cc,int m,int n){
        if(cr>=0 && cc>=0 && cr<m && cc<n){
            return true;
        }
        return false;
    }
}