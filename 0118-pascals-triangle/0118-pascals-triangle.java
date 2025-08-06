class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            int ans=1;
            List<Integer> ansRow = new ArrayList<>();
            ansRow.add(1);
            for(int col=1;col<row;col++){
                ans=ans*(row-col);
                ans=ans/col;
                ansRow.add(ans);
            }
            res.add(ansRow);
        }
        return res;
    }
}