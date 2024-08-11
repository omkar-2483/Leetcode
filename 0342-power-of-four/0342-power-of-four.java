class Solution {
    public boolean isPowerOfFour(int n) {
        if(n>0){
            return n==1 || (n%4==0 && isPowerOfFour(n/4));
        }else{
            return false;
        }
    }
}