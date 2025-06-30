int search(int* nums, int numsSize, int target) {
    int left = 0,right  = numsSize -1;

    while(left <= right){
        int mid = (left + right)/2;
        if(nums[mid] < target){
            left = mid+1;
        }
        else if(nums[mid] > target){
            right = mid-1;
        }
        else
        return mid;
    }

    return -1;
}
