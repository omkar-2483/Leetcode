public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int bit = (n & 1); 
            ans = ans | (bit << (31 - i));
            n = n >>> 1;  // Logical right shift (fills left bits with 0)
        }
        return ans;
    }
}