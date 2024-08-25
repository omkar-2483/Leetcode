class StockSpanner {
    List <Integer> stock ;
    Stack <Integer> st;
    int idx;

    public StockSpanner() {
        stock = new ArrayList<>();
        st = new Stack<>();
        idx=-1;
    }
    
    public int next(int price) {
        stock.add(price);
        idx++;
        while(!st.isEmpty() && stock.get(st.peek())<=price){
            st.pop();
        }
        if(st.isEmpty()) {
            st.push(idx);
            return idx+1;
        }
        int prev = st.peek();
        st.push(idx);
        return idx-prev;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */