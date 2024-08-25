class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextG = new int[nums2.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek()<nums2[i]) st.pop();
            if(st.isEmpty()){
                nextG[i]=-1;
                st.push(nums2[i]);
            }else{
                nextG[i]=st.peek();
                st.push(nums2[i]);
            }
        }

        int[] ans=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int idx=getIndex(nums1[i],nums2);
            ans[i]=nextG[idx];
        }
        return ans;
    }

    public int getIndex(int target, int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
}