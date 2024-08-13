class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        findSubset(candidates, target, 0, subset, list, 0);
        return list;
    }

    public static void findSubset(int[] candidates, int target, int idx, List<Integer> subset, List<List<Integer>> list, int sum) {
        // Base case: if the sum equals the target
        if (sum == target) {
            list.add(new ArrayList<>(subset)); // Add a copy of the current subset to the list
            return;
        }

        // If index is out of bounds or the sum exceeds the target, return
        if (idx == candidates.length || sum > target) {
            return;
        }

        // Iterate through the candidates starting from the current index
        for (int i = idx; i < candidates.length; i++) {
            // Include the current element and explore further
            subset.add(candidates[i]);
            findSubset(candidates, target, i, subset, list, sum + candidates[i]);

            // Backtrack to explore other possibilities
            subset.remove(subset.size() - 1);
        }
    }
}