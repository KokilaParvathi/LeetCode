class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();  

        Arrays.sort(nums);
         
        int missing = 1,twotime = 0;
        int[] res = new int[2];

        for(int num:nums){
            if(num == missing) missing++;
        }
        res[1] = missing;

        for(int num:nums){
            if(hs.contains(num)){
                res[0] = num;
                break;
            }
            else
            hs.add(num);
        }

    return res;
    }
}