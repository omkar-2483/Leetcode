class MyCircularDeque {
    int[] cq;
    int k;
    int front;
    int rear;

    public MyCircularDeque(int k) {
        cq=new int[k];
        front=rear=-1;       
        this.k = k; 
    }
    
    public boolean insertFront(int value) {
        if(isFull()){ return false;}
        if(isEmpty()){
            front++;
            rear++;
        }
        else if(front==0){
            front=k-1;
        }else{
            front= front-1;
        }
        cq[front]=value;
        return true;   
    }
    
    public boolean insertLast(int value) {
        if(isFull()){ return false; }
        if(isEmpty()){
            front++;
            rear++;
        }else{
            rear=(rear+1)%k;
        }
        cq[rear]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(front==rear){ 
            front=rear=-1;
        }else{
            front=(front+1)%k;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(front==rear){
            front=rear=-1;
        }
        else if(rear==0){
            rear=k-1;
        }
        else{
            rear=(rear-1)%k;
        }
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return cq[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return cq[rear];
    }
    
    public boolean isEmpty() {
        if(front==-1 && rear==-1) return true;
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%k==front) return true;
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */