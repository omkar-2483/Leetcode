class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i: nums){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }else{
                hm.put(i, 1);
            }
        }
        Set<Integer> keys = hm.keySet();
        int n= nums.length/3;
        for(int i: keys){
            if(hm.get(i) > n) list.add(i);
        }

        return list;
    }
}