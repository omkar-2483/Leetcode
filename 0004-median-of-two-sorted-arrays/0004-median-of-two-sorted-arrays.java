class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] nums=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        //merge sort
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums[k]=nums1[i];
                i++;
            }
            else{
                nums[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums[k]=nums1[i];
            i++;
            k++;
        }
         while(j<n){
            nums[k]=nums2[j];
            j++;
            k++;
        }
        for(int l=0;l<n+m;l++){
            System.out.print(nums[l]+" ");
        }
        if((n+m)%2==0){
            double num1=(double) nums[(n+m)/2];
            double num2=(double) nums[((n+m)/2)-1];
            return (num1+num2)/2;
        }
        else{
            return nums[((n+m)/2)];
        }

    }
}