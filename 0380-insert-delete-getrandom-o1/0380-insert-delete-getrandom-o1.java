class RandomizedSet {
    HashSet<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }else{
            return false;
        }
    }
    
    public int getRandom() {
        int  rand = (int)( Math.random()*set.size());
        int i=0;
        for(int val: set){
            if(i==rand) return val;
            i++;
        }
        return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */