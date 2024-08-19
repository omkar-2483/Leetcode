class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int[] temp=new int[k];
        for(int i=nums.length-k, j=0 ; i< nums.length ;i++,j++){
            temp[j]=nums[i];
        }

        int i;
        for ( i=nums.length-1 ; i>=k;i--){
            nums[i]=nums[i-k];
        }
        int j=temp.length-1;
        while(i>=0){
            nums[i]=temp[j];
            i--;
            j--;
        }
    }
}