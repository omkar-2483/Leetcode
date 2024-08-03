class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] targetCount =new int[1001];
        int[] arrCount =new int[1001];

        for(int i=0; i<target.length; i++){
            targetCount[target[i]]++;
        }
        for(int i=0; i<arr.length; i++){
            arrCount[arr[i]]++;
        }

        boolean ans=true;
        for(int i=0; i<=1000; i++){
            ans = ans & (targetCount[i]==arrCount[i]);
        }
        return ans;
    }

}