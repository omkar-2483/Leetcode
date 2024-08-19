class Solution {
    // public void rotate(int[] nums, int k) {
    //     k=k%nums.length;
    //     int[] temp=new int[k];
    //     for(int i=nums.length-k, j=0 ; i< nums.length ;i++,j++){
    //         temp[j]=nums[i];
    //     }

    //     int i;
    //     for ( i=nums.length-1 ; i>=k;i--){
    //         nums[i]=nums[i-k];
    //     }
    //     int j=temp.length-1;
    //     while(i>=0){
    //         nums[i]=temp[j];
    //         i--;
    //         j--;
    //     }
    // }


    //0ms
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}