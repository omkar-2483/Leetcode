public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans=0;
        int shifts =31;
        while(n !=0){
            int bit;
            if((n & 1)==0) bit=0;
            else bit=1;

            ans = ans | (bit << shifts);
            n = n >>> 1;
            shifts--;
        }
        return ans;
    }
}