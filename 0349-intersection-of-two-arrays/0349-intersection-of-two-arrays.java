class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list= new ArrayList<>();

        for(int i:nums1) set.add(i);
        for(int i:nums2){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);
            }
        }
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();
        return ans;

    }
}