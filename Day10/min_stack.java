class MinStack {
    
    Stack<Integer> stk;
    Stack<Integer> min;

    public MinStack() {
        stk=new Stack<>();
        min=new Stack<>();

    }
    
    public void push(int val) {
        stk.push(val);
        if(min.isEmpty()||min.peek()>=stk.peek()) min.push(val);
    }
    
    public void pop() {
        if(!stk.isEmpty()){
            int a=stk.pop();
            if(min.peek()==a) min.pop();
        }
    }
    
    public int top() {
        if(stk.isEmpty()) return -1;
        return stk.peek();
    }
    
    public int getMin() {
        if(min.isEmpty()) return -1;
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */