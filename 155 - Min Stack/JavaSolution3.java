class MinStack {
    class Node{
        int value;

        Node next;

        Node(int x){
            this.value = x;
            next = null;
        }
    }
    int minimum;
    Node head;
    /** initialize your data structure here. */
    public MinStack() {
        // head = new Node();
    }

    public void push(int x) {
        if (head == null){
            head = new Node(x);
            minimum = x;
        }
        else{
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            if(x < minimum){
                minimum = x;
            }
        }
    }

    public void pop() {
        if (head.value == minimum){
            minimum = Integer.MAX_VALUE;
            Node temp = head.next;
            while(temp != null){
                if(temp.value < minimum)
                    minimum = temp.value;
                temp = temp.next;
            }
        }

        head = head.next;
    }

    public int top() {
        return head.value;

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