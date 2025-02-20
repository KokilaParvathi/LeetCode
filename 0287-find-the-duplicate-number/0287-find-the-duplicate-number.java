class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> hm = new HashSet<>();

    for(int num:nums){
        if(hm.contains(num))
            return num;

        else
            hm.add(num);
    }  

    return -1; 
    }
}