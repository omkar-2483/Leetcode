class Solution {
    public int getSum(int a, int b) {
        //sum = A xor B
        // remainder = A and B
        int sum = a ^ b;
        int rem = a & b;
        while(rem !=0){
            rem = rem << 1;
            int temp = sum ^ rem;
            rem = sum & rem;
            sum=temp; 
        }
        return sum;
    }
}