class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            min = Math.min(min, arr[i+1]-arr[i]);
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]==min){
                ans.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return ans;
    }
}