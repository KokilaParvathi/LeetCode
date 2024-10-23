void merge(int* nums, int lb, int mid, int ub) {
    int i = lb, j = mid + 1, k = 0;
    int temp[ub - lb + 1];
    
    while (i <= mid && j <= ub) {
        if (nums[i] >= nums[j]) {
            temp[k++] = nums[i++];
        } else {
            temp[k++] = nums[j++];
        }
    }
    
    while (i <= mid) {
        temp[k++] = nums[i++];
    }
    
    while (j <= ub) {
        temp[k++] = nums[j++];
    }
    
    for (i = lb, k = 0; i <= ub; i++, k++) {
        nums[i] = temp[k];
    }
}

void mergesort(int* nums, int lb, int ub) {
    if (lb < ub) {
        int mid = lb + (ub - lb) / 2;
        mergesort(nums, lb, mid);
        mergesort(nums, mid + 1, ub);
        merge(nums, lb, mid, ub);
    }
}

int findKthLargest(int* nums, int n, int k) {
    mergesort(nums, 0, n - 1);
    return nums[k-1]; 
}
