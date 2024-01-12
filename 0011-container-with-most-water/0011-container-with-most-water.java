class Solution {
    public int maxArea(int[] height) {
        int ans=Integer.MIN_VALUE;
        int n=height.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            if(area>ans){
                ans=area;
            }
            if(height[left]<=height[right]){
                left++;
            }
            else{
                right--;
            }

        }
        return ans;
    }
}