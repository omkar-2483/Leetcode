class Solution {
    public int evalRPN2(String[] tokens) {
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

    //less time overhead
     public int evalRPN(String[] tokens) {
    int[] stack = new int[tokens.length];
    int index = 0;
    for(String  token: tokens){
        switch (token){
            case "+":
                stack[index - 2] = stack[index - 2] + stack[index - 1];
                index--;
                break;
            case "-":
                stack[index-2] = stack[index - 2] - stack[index-1];
                index--;
                break;
            case "*":
                stack[index-2] = stack[index - 2] * stack[index-1];
                index--;
                break;
            case "/":
                stack[index-2] = stack[index - 2] / stack[index-1];
                index--;
                break;
            default:
                stack[index++] = Integer.parseInt(token);
        }
    }
    return stack[0];
    }
}