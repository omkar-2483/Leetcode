class Solution {
    public int subsetXORSum(int[] nums) {
        return findSubset(nums,new ArrayList<Integer>(), 0);
    }

    public static int findSubset(int[] nums, List<Integer> subset, int start){
        //base case
        if(start==nums.length){
            int xor= 0;
            for(int i=0; i<subset.size();i++){
                xor = xor ^ subset.get(i);
            }
            return xor;
        }

        int sum=0;

        //backtrack
            sum+=findSubset(nums,subset,start+1);
            subset.add(nums[start]);
            sum+=findSubset(nums,subset,start+1);
            subset.remove(subset.size()-1);
        return sum;
    }
}