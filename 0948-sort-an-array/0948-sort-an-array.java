class Solution {
    void merge(int[] arr, int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid+1;

         while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }

         for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low); 
        }

    }

    void mergesort(int[] arr,int low,int high){
        if(low >= high) return;

        int mid = (low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public int[] sortArray(int[] nums) {
    mergesort(nums,0,nums.length - 1);
     return nums;   
    }
}