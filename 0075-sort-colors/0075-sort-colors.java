class Solution {
    public void sortColors(int[] nums) {
        //heapSort(nums);  // O(N * logN)
        //countSort(nums);  //O(N)

        // Dutch National flag algorithm. O(N)
        DNFsort(nums);
    }

    private void DNFsort(int[] arr){
        //rule
        //arr[0...low-1] = 0
        //arr[low...mid-1] = 1
        //arr[mid...high] = unsorted arr
        //arr[high+1..n-1] = 2

        //we assume whole arr as unsorted
        int low = 0, mid = 0, high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{  //arr[mid]==2
                swap(arr, mid, high);
                high--;
            }
        }

    }

    private void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void countSort(int[] arr){
        int[] count = new int[3];
        for(int i: arr) count[i]++;

        for(int i=0; i<arr.length; i++){
            if(count[0]!=0){ 
                arr[i]=0;
                count[0]--;
            }
            else if(count[1]!=0){ 
                arr[i]=1;
                count[1]--;
            }
            else arr[i]=2;
        }
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