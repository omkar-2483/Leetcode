class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> set= new HashSet<>();
        int ans[]=new int[2];
        for(int i:nums1) set.add(i);
        int count=0;
        for(int i:nums2){
            if(set.contains(i)) count++;
        }
        ans[1]=count;
        set= new HashSet<>();
        for(int i:nums2) set.add(i);
        count=0;
        for(int i:nums1){
            if(set.contains(i)) count++;
        }
        ans[0]=count;
        return ans;

    }
}