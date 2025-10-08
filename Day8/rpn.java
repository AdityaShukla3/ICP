class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int b=st.pop();
                int a=st.pop();
                int res=0;
                if(s.equals("+"))res=a+b;
                else if(s.equals("-"))res=a-b;
                else if(s.equals("*"))res=a*b;
                else res=a/b;
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int b=st.pop();
                int a=st.pop();
                int res=0;
                if(s.equals("+"))res=a+b;
                else if(s.equals("-"))res=a-b;
                else if(s.equals("*"))res=a*b;
                else res=a/b;
                st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}