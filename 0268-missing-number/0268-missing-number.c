int missingNumber(int* nums, int numsSize) {
    int num;
    for(int i=0;i<numsSize;i++){
       for(int j=i+1;j<numsSize;j++){
        if(nums[i]>nums[j]){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
       }
    }
     num=0;
    for(int i=0;i<numsSize;i++,num++){
        if(nums[i]!=num)
        break;
    }
    return num;
}