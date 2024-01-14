class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int[] freq=new int[101];
        for(int i=0;i<101;i++){
            freq[i]=0;
        }
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int maxFreq=Integer.MIN_VALUE;
        int count=0;
        for(int i=1;i<101;i++){
            if(freq[i]>maxFreq){
                maxFreq=freq[i];
                count=1;
            }else if(freq[i]==maxFreq){
                count++;
            }
        }
        return count*maxFreq;
    }
}
