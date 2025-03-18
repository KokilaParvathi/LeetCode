class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,result,new ArrayList<>());
        return result;
    }
    private void backtrack(int[] nums,List<List<Integer>> result,List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int num:nums){
            if(!temp.contains(num)){
                temp.add(num);
                backtrack(nums,result,temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}