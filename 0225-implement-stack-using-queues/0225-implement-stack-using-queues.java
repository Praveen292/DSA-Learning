class MyStack {
      Queue<Integer> Q1;
      Queue<Integer> Q2;
    public MyStack() {
         Q1 = new LinkedList<>();
         Q2 = new LinkedList<>();

    }
    
    public void push(int x) {
        Q2.add(x);

        while(!Q1.isEmpty()){
            Q2.add(Q1.remove());
        }

        Queue<Integer> temp = Q1;
        Q1 = Q2;
        Q2 = temp;
    }
    
    public int pop() {
        return Q1.remove();
    }
    
    public int top() {
        if(Q1.isEmpty()){
            System.out.println("Queue is Empty");
        }
        return Q1.peek();
       
    }
    
    public boolean empty() {
        if(Q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */