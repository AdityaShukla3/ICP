class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            boolean ans=false;
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    ans=helper(board,word,0,i,j);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    static boolean helper(char[][] board,String word,int idx,int i,int j){
        if(idx==word.length()) return true;
        if(i>=board.length||i<0 || j>=board[0].length||j<0||board[i][j]=='@') return false;
        if(board[i][j]!=word.charAt(idx)) return false;
        char c=board[i][j];
        board[i][j]='@';
        int[] dr={0,1,0,-1};
        int[] dc={1,0,-1,0};
        for(int k=0;k<4;k++){
            if(helper(board,word,idx+1,i+dr[k],j+dc[k])){
                return true;
            }
        }
        board[i][j]=c;
        return false;
    }
    
}