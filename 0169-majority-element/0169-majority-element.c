int majorityElement(int* nums, int numsSize) {
    int count = 0;
    int majority = 0;

    for (int i = 0; i < numsSize; i++) {
        if (count == 0) {
            majority = nums[i];
        }
        count += (nums[i] == majority) ? 1 : -1;
    }

    return majority;
}
