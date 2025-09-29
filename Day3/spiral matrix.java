class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        List<Integer> list =new ArrayList<>();
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;

        while(endRow>=startRow && endCol>=startCol){
            for(int i=startCol;i<=endCol;i++){
                list.add(arr[startRow][i]);
            }
            startRow++;
            for(int i=startRow;i<=endRow;i++){
                list.add(arr[i][endCol]);
            }
            endCol--;
            if(startRow<=endRow)
            {   
                for(int i=endCol;i>=startCol;i--){
                    list.add(arr[endRow][i]);
                }
            }
            endRow--;
            if(startCol<=endCol){
                for(int i=endRow;i>=startRow;i--){
                    list.add(arr[i][startCol]);
                }
                startCol++;
            }
        }
        return list;
    }
}