class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutations(nums, new ArrayList<>(), ans);
        return ans;
    }

    public static void findPermutations(int nums[], List<Integer> per, List<List<Integer>> ans){
        //base case
        if(per.size()==nums.length){
            ans.add(new ArrayList<>(per));
            return;
        }
        //recursion
        int n= nums.length;
        for(int i=0; i<n ;i++){
            if (per.contains(nums[i])) continue;  // Skip if the number is already in the current permutation
            per.add(nums[i]);
            findPermutations(nums, per, ans); 
            per.remove(per.size() - 1);           
        }
    }
}