class Solution {
    public double myPow(double x, int n) {
        if(n== 0) return 1;
        if(n==-1) return 1/x;
        double halfPow= myPow(x, n/2);
        double ans= halfPow * halfPow;
        if(n%2==0 ) return ans;
        else{
            if(n>0) return x*ans;
            else return (1/x)*ans;
        }         
    }
}