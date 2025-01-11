class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i, 1);
            }
        }
        Set<Integer> keys = hm.keySet();
        int n= nums.length/2;
        for(int i: keys){
            if(hm.get(i) > n) return i;
        }
        return -1;
    }
}