class MinStack {
    List<Integer> stack;
    int minimum;
    int top = -1;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new ArrayList<>();
        minimum = Integer.MAX_VALUE;
    }

    public void push(int x) {
        stack.add(x);
        top++;
        minimum = Math.min(minimum, x);
    }

    public void pop() {
        if (stack.get(top) == minimum){
            minimum = Integer.MAX_VALUE;
            for(int i =0; i< top; i++)
                minimum = Math.min(minimum, stack.get(i));
        }
        stack.remove(top);
        top--;

    }

    public int top() {
        return stack.get(top);
    }

    public int getMin() {
        return minimum;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */