class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int curr=0;
        for(int i=1; i<=n; i++){
            if(curr==target.length) break;
            if(target[curr]==i){
                list.add("Push");
                curr++;
            }else{
                list.add("Push");
                list.add("Pop");
            }
        }
        return list;
    }
}