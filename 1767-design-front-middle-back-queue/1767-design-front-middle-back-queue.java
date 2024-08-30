class FrontMiddleBackQueue {
    Deque<Integer> deque1;
    Deque<Integer> deque2;

    public FrontMiddleBackQueue() {
        deque1 = new LinkedList<>();
        deque2 = new LinkedList<>();
    }

    private void balance() {
        // If deque1 has more than one extra element compared to deque2
        if (deque1.size() > deque2.size() + 1) {
            deque2.addFirst(deque1.removeLast());
        }
        // If deque2 has more elements than deque1
        else if (deque1.size() < deque2.size()) {
            deque1.addLast(deque2.removeFirst());
        }
    }
    
    public void pushFront(int val) {
        deque1.addFirst(val);
        balance();
    }
    
    public void pushMiddle(int val) {
        if (deque1.size() > deque2.size()) {
            deque2.addFirst(deque1.removeLast());
        }
        deque1.addLast(val);
        balance();
    }
    
    public void pushBack(int val) {
        deque2.addLast(val);
        balance();
    }
    
    public int popFront() {
        if (deque1.isEmpty()) {
            return -1;
        }
        int f = deque1.removeFirst();
        balance();
        return f;
    }
    
    public int popMiddle() {
        if (deque1.isEmpty()) {
            return -1;
        }
        int m;
        m = deque1.removeLast();
        balance();
        return m;
    }
    
    public int popBack() {
        if (deque2.isEmpty()) {
            if (deque1.isEmpty()) {
                return -1;
            }
            return deque1.removeLast();
        }
        int l = deque2.removeLast();
        balance();
        return l;
    }
}

/**
 * Your FrontMiddleBackQueue object will be instantiated and called as such:
 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
 * obj.pushFront(val);
 * obj.pushMiddle(val);
 * obj.pushBack(val);
 * int param_4 = obj.popFront();
 * int param_5 = obj.popMiddle();
 * int param_6 = obj.popBack();
 */