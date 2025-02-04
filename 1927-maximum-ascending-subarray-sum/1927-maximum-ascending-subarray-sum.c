int maxAscendingSum(int* nums, int numsSize) {
    int curr=nums[0],max=nums[0];
    for(int itr =1; itr<numsSize; itr++){
        if(nums[itr-1]<nums[itr]){
            curr+=nums[itr];
        }
        else{
            max=curr>max?curr:max;
            curr=nums[itr];
        }
    }
    return curr>max?curr:max;
}