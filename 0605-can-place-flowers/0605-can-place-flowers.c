bool canPlaceFlowers(int* nums, int flowerbedSize, int n) {
        int len = flowerbedSize,i =0;

        while(i<len && n>0){
            if(nums[i] == 1) i += 2;
            else if (i == len-1 || nums[i+1] == 0){
                n--;
                i += 2;
            }
            else{
                i += 3;
            }

        }

    return n==0;
}
 