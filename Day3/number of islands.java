class Solution{
    public int numIslands(char[][] grid) {

            int n=grid.length;
            int m=grid[0].length;

            int c=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]=='1'){
                        c++;
                        clear(grid,i,j);
                    }
                }
            }
            return c;
        }
        void clear(char[][] grid,int i,int j){
            if(i>=grid.length || i<0 || j<0 || j>=grid[0].length || grid[i][j]=='0') return;
            
            grid[i][j]='0';

            int[][] d={{1,0},{0,-1},{-1,0},{0,1}};
            for(int[] dir:d){
                clear(grid,i+dir[0],j+dir[1]);
            }
    }
}