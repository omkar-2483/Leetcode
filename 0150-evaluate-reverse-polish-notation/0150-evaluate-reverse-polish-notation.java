class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> st=new Stack<>();

        for(int i=0; i<tokens.length; i++){
            if(tokens[i].equals("+")){
                st.push(st.pop()+st.pop());
            }else if(tokens[i].equals("-")){
                int sec=st.pop();
                int fir=st.pop();
                st.push(fir-sec);
            }else if(tokens[i].equals("*")){
                st.push(st.pop()*st.pop());
            }else if(tokens[i].equals("/")){
                int sec=st.pop();
                int fir=st.pop();
                st.push(fir/sec);
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}