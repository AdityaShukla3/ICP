class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));
        int arrow=1;
        int pStart=points[0][0];
        int pEnd=points[0][1];
        for(int i=1;i<points.length;i++){
            int curStart=points[i][0];
            int curEnd=points[i][1];
            if(curStart>pEnd){
                arrow++;
                pStart=curStart;
                pEnd=curEnd;
            }
            else{
                pStart=Math.max(pStart,curStart);
                pEnd=Math.min(pEnd,curEnd);
            }
        }
        return arrow;
    }
}