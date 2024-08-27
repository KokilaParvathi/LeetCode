void moveZeroes(int* nums, int numsSize) {
    short c=0;
    for(int i=0;i<numsSize;i++){
       if(nums[i]!=0){
        nums[c]=nums[i];
        c++;
       }
    }
    for(int i=c;i<numsSize;i++){
        nums[i]=0;
    }
    
}