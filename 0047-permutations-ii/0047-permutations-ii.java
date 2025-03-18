class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(nums,result,new ArrayList<>(),visited);
        return result;
    }

    private void backtrack(int[] nums,List<List<Integer>> result,List<Integer> temp,boolean[] visited){
        if(temp.size() == nums.length){
            if(!result.contains(temp)){
            result.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i = 0;i < nums.length ;i++){
            int num = nums[i];
            if(visited[i] == false){
                temp.add(num);
                visited[i] = true;
                backtrack(nums,result,temp,visited);
                temp.remove(temp.size() - 1);
                 visited[i] = false;
            }
        }
    }
}