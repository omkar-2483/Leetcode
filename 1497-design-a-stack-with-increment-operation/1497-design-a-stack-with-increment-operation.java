class CustomStack {
    int[] stack;
    int top;

    public CustomStack(int maxSize) {
        this.top = -1;
        stack = new int[maxSize];
    }
    
    public void push(int x) {
        if(top==stack.length-1) return;
        stack[++top]=x;
    }
    
    public int pop() {
        if(top==-1)return -1;
        return stack[top--];        
    }
    
    public void increment(int k, int val) {
        int i=0;
        while(i<=top && i<k){
            stack[i]+=val;
            i++;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */