class Solution {
    public void sortColors(int[] nums) {
        heapSort(nums);
    }

    private void heapSort(int[] arr){
        int n= arr.length;
        //build max Heap
        for(int i=n/2; i>=0; i--){
            heapify(arr, i, n);
        }

        //sort
        for(int i=n-1; i>0; i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr, 0, i);
        }
    }

    private void heapify(int[] arr, int i, int n){
        int left=i*2+1;
        int right=i*2+2;
        int maxIdx=i;

        if(left<n && arr[left]>arr[maxIdx]) maxIdx=left;
        if(right<n && arr[right]>arr[maxIdx]) maxIdx=right;
        if(maxIdx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify(arr, maxIdx, n);
        }
    }
}