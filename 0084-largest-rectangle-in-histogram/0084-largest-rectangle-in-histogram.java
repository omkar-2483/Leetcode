class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int[] nsr= new int[heights.length];
        int[] nsl=new int[heights.length];

        //find next smaller rigth
        Stack<Integer> st=new Stack<>();

        for(int i=heights.length-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>= heights[i]) st.pop();
            if(st.isEmpty()) nsr[i]=heights.length;
            else nsr[i]=st.peek();
            st.push(i);
        }

        //find next smallest left
        st=new Stack<>();

        for(int i=0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()]>= heights[i]) st.pop();
            if(st.isEmpty()) nsl[i]=-1;
            else nsl[i]=st.peek();
            st.push(i);
        }   

        //calculate area for each height
        for(int i=0; i<heights.length; i++){
            int currArea= heights[i]*(nsr[i]-nsl[i]-1);
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}