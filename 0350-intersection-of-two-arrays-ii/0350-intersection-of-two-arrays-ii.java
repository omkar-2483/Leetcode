class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i:nums1){
            if(map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i,1);
        }

        List<Integer> list= new ArrayList<>();
        for(int i: nums2){
            if(map.containsKey(i) && map.get(i)!=0){
                list.add(i);
                map.put(i, map.get(i)-1);
            }
        }

        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;
         
    }
}