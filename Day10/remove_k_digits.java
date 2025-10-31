class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk=new Stack<>();
        int idx=0;
        int n=num.length();
        while(idx<n){
            while(!stk.isEmpty() && k>0 && ((stk.peek()-'0')>(num.charAt(idx)-'0'))){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(idx));
            idx++;
        }

        while(k>0){
            stk.pop();
            k--;
        } 

        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()) sb.append(stk.pop());

        sb.reverse();
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0') i++;
        String ans=sb.substring(i);
        
        if(ans.length()==0) return "0";
        return ans;
    }
}