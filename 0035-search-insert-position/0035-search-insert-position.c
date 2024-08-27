int searchInsert(int* nums, int numsSize, int target) {
short index,flag=0;
    for(int i=0;i<numsSize;i++){
        if(target==nums[i]){
        return i;
        }
        else if(target<nums[i]){
            index=i;
            flag=1;
            break;
        }
    }
    if(flag==1)
    return index;
    else
    return numsSize;
}