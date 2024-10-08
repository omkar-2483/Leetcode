class Solution {
    class Num implements Comparable<Num>{
        int val;
        int idx;
        public Num(int val, int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Num n2){
            return n2.val-this.val;
        }

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Num> pq= new PriorityQueue<>();
        int[] res = new int[nums.length-k+1];
        // add all first k numbers in pq
        for(int i=0; i<k; i++){
            pq.add(new Num(nums[i], i));
        }
        //first max
        res[0]=pq.peek().val;
        
        //for all remaining numbers
        for(int i=k; i<nums.length; i++){
            //remove max mumbers which are not part of window
            while(pq.size()>0 && pq.peek().idx<=(i-k)) pq.remove();
            //add new number in window
            pq.add(new Num(nums[i], i));
            // get max for i-k+1 th window
            res[i-k+1]=pq.peek().val;
        }
        return res;
    }
}