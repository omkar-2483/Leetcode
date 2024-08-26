class Solution {
    public String simplifyPath(String path) {
        int n=path.length();
        Stack<String> st= new Stack<>();

        for(int i=0; i<n; i++){
            while(i<n && path.charAt(i)=='/') i++;
            String dir="";
            while(i<n && path.charAt(i)!='/'){
                dir+=path.charAt(i);
                i++;
            }

            if(dir.equals(".")){
                continue;
            }
            else if(dir.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else if(dir.length()!=0){
                st.push(dir);
            }

        }

        if(st.isEmpty()) return "/";

        StringBuilder sb=new StringBuilder("");
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
            sb.insert(0,"/");
        }
        return sb.toString();
    }
}