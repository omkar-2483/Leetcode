class Solution {
    public List<String> validStrings(int n) {
        List<String> list= new ArrayList<>();
        generateBS(n, 1, "", list);
        return list;
    }

    public void generateBS(int n, int lastplace, String str, List<String> list){
        if(n==0){
            list.add(str);
            return;
        }
        generateBS(n-1,1,str+"1",list);
        if(lastplace==1){
            generateBS(n-1,0,str+"0",list);
        }
    }
}