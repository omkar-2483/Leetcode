class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0]=0;
        int base =0;
        int next = 1;
        for(int i=1; i<=n; i++){
            if(i< next) {
                ans[i]=ans[base]+1;
                base++;
            }
            if(i==next){
                 ans[i]=1;
                 base=1;
                 next=next*2;
            }
        }
        return ans;        
    }

}