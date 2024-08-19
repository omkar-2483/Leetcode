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

    public void rotate(int[] nums, int k) {

    if(nums == null || nums.length < 2){
        return;
    }
    
    k = k % nums.length;
    reverse(nums, 0, nums.length - k - 1);
    reverse(nums, nums.length - k, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
    
}

private void reverse(int[] nums, int i, int j){
    int tmp = 0;       
    while(i < j){
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        i++;
        j--;
    }
}
}