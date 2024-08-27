int pivotIndex(int* nums, int numsSize) {
int i,l,r,flag=0;
    for( i=0;i<numsSize;i++){
        l=0;
        r=0;
        for(int j=0;j<i;j++){
            l=l+nums[j];
        }
        for(int k=i+1;k<numsSize;k++){
            r=r+nums[k];
        }

        if(l==r){
           return i;
        }
    }
    return -1;
}