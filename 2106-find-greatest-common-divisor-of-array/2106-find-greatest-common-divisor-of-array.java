class Solution {
    public int findGCD(int[] nums) {
    int min = nums[0],max = nums[0];

    for(int num:nums){
        max = Math.max(max,num);
        min = Math.min(min,num);
    }

    int itr = (min < max) ? max - min : min;

   while(itr > 1){
        if(min % itr == 0 && max % itr == 0) return itr;
        itr--;
    }

    return 1;
    }
}