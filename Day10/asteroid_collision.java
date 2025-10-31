class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<asteroids.length;i++){
            while(!stack.isEmpty() &&(asteroids[i]^stack.peek())<0&&stack.peek()>0 && asteroids[i]<0){
                if(Math.abs(asteroids[i])>Math.abs(stack.peek())){
                    stack.pop();
                }   
                else if(Math.abs(asteroids[i])==Math.abs(stack.peek())){
                    stack.pop();
                    asteroids[i]=0;
                    break;
                }
                else{
                    asteroids[i]=0;
                    break;
                }
            }
            if(asteroids[i]!=0)
                stack.push(asteroids[i]);
        }
        int[] ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}