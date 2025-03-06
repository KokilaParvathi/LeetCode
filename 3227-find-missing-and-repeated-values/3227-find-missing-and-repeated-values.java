class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       HashSet<Integer> set = new HashSet<>();
       int missing = 0,repeat = 0;

        for(int[] arr:grid){
            for (int num : arr) {  
                if (set.contains(num))  repeat = num;  
                set.add(num);
            }
        }

        for(int i = 1; i <= grid.length*grid.length ;i++){
            if(!set.contains(i))    missing = i;

        }

        return new int[]{repeat, missing};
    }
}