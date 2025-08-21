class Solution {
    public int findMin(int[] arr) {
        int left = 0, right = arr.length -1;

        while(left < right){
            int mid = (left+right)/2;

            if(arr[mid] > arr[right])
                left = mid+1;
            else right--;

        }

        return arr[left];
    }
}