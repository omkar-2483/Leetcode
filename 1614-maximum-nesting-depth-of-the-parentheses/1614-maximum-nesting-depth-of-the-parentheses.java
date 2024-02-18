class Solution {
    public int maxDepth(String s) {
        int maxDepth=0;
        int left=0;
        int right=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                left++;
            }else if(ch==')'){
                int depth=left-right;
                if(depth>maxDepth){
                    maxDepth=depth;
                }
                right++;
            }else{
                int depth=left-right;
                if(depth>maxDepth){
                    maxDepth=depth;
                }
            }
        }
        return maxDepth;
    }
}