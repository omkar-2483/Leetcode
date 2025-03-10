class Solution {
    public int missingNumber2(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i: nums) sum+=i;
        return (n* (n+1) / 2) - sum;
    }

    //using xor
    public int missingNumber(int[] nums){
        // a ^ a =0
        // a ^ 0 = a
        // (xor of 0 to N) ^ (xor of num: nums) = (0^0)^(1^1)...(missing number)...(n^n) = missing number
        int xor1 = 0;
        for(int i=0; i<=nums.length; i++){
            xor1 = xor1 ^ i;
        }        
        int xor2=0;
        for(int num: nums){
            xor2 = xor2 ^ num;
        }

        return (xor1 ^ xor2);
    }

}