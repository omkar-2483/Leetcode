class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int front=0;
        int back=s.length()-1;
        
        //ascii value of a=97, z=122
        while(front<back){
            int f= s.charAt(front); 
            int b= s.charAt(back); 
            if(!Character.isLetterOrDigit(f)){
                front++;
            }else if(!Character.isLetterOrDigit(b)){
                back--;
            }else if(f!=b){
                return false;
            }else{
                front++;
                back--;
            }
        }
        return true;
    }
}