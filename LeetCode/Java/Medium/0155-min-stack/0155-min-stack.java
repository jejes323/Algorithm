class MinStack {
    Deque<Integer> stack;
    Deque<Integer> ex;

    public MinStack() {
        stack = new ArrayDeque<>();
        ex = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);

        if(!ex.isEmpty() && ex.peek() >= val) {
            ex.push(val);
        } else if (ex.isEmpty()) {
            ex.push(val);
        }
    }
    
    public void pop() {
        int remove = stack.pop();
        if(remove == ex.peek()) {
            ex.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return ex.peek();
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