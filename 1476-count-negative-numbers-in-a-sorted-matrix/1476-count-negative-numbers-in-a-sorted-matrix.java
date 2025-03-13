class Solution {
    public int countNegatives(int[][] grid) {
        int neg = 0;

        for(int[] arr:grid){
            Arrays.sort(arr);
            for(int num:arr){
                if(num < 0) neg++;
            }
        }
        
        return neg;
    }
}