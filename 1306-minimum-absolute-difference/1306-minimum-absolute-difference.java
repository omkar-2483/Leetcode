class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(Math.abs(arr[i]-arr[i+1])<minDiff){
                minDiff=Math.abs(arr[i]-arr[i+1]);
            }
        }

        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]==minDiff){
                ans.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return ans;
    }
}