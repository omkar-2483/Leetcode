class Solution {
    public int[] productExceptSelf2(int[] nums) {
        int n=nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0]=nums[0];
        right[n-1]=nums[n-1];
        for(int i=1;i<n; i++){
            left[i]=left[i-1]*nums[i];
            right[n-i-1]=right[n-i]*nums[n-i-1];
        }
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            if(i==0) ans[i]=right[i+1];
            else if(i==n-1) ans[i] = left[i-1];
            else ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }

   //space otimization
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        ans[0]=nums[0];
        for(int i=1; i<n; i++){
            ans[i]=ans[i-1]*nums[i];
        }
        int right=1;
        for(int i=n-1; i>0; i--){
            ans[i]=ans[i-1]*right;
            right*=nums[i];
        }
        ans[0]=right;
        return ans;
    }
}