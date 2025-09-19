class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> pair = new HashSet<>();

        for(int num:nums){
            if(set.contains(num-k)){
                int min = Math.min(num,num-k);
                int max = Math.max(num,num-k);
                pair.add(min +""+max);
            }
            if(set.contains(num+k)){
                int min = Math.min(num,num+k);
                int max = Math.max(num,num+k);
                pair.add(min +""+max);
            }
            set.add(num);
        }
        return pair.size();
    }
}