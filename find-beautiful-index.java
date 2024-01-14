class Solution {
    public ArrayList<Integer> beautifulIndices(String s, String a, String b, int k) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        ArrayList<Integer> I=new ArrayList<Integer>();
        ArrayList<Integer> J=new ArrayList<Integer>();
        int maxIndex1=s.length()-a.length();
        int maxIndex2=s.length()-b.length();
        for(int i=0;i<=maxIndex1;i++){
            if(s.substring(i,i+a.length()).equals(a)){
                I.add(i);
            }
        }
        for(int j=0;j<=maxIndex2;j++){
            if(s.substring(j,j+b.length()).equals(b)){
                J.add(j);
            } 
        }
        for(int i=0;i<I.size();i++){
            for(int j=0;j<J.size();j++){
                if(Math.abs(I.get(i)-J.get(j))<=k){
                    ans.add(I.get(i));
                    break;
                }
            }
        }
        return ans; 
    }
}
