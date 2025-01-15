class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();

        for(int i: nums1) set.add(i);
        for(int i: nums2) set.remove(i);
        for(int i: set) list.add(i);
        ans.add(list);

        list=new ArrayList<>();
        set= new HashSet<>();
        
        for(int i: nums2) set.add(i);
        for(int i: nums1) set.remove(i);
        for(int i: set) list.add(i);
        ans.add(list);

        return ans;
    }
}