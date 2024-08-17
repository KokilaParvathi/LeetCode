int findClosestNumber(int* nums, int numsSize) {
    long minlenth=9223372036854775807,dis,num;
    for(int i=0;i<numsSize;i++){
         dis=abs(nums[i]-0);
        if(dis<=minlenth){
            if(minlenth==dis){
               num=num>nums[i]?num:nums[i];
               minlenth=dis;
            }
            else{
            num=nums[i];
            minlenth=dis;
            }
        }
    }
    return num;
}