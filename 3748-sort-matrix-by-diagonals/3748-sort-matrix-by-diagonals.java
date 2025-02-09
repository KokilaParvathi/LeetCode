class Solution {
    public int[][] sortMatrix(int[][] grid) {
    HashMap<Integer,PriorityQueue<Integer>> map = new HashMap<>();
    for(int itr = 0; itr < grid.length; itr++){
        for(int itr2 = 0; itr2 < grid.length; itr2++){
            if(!map.containsKey(itr - itr2)){
                if(itr - itr2 < 0) map.put(itr - itr2, new PriorityQueue<>());
                else map.put(itr - itr2, new PriorityQueue<>(Collections.reverseOrder()));
            }
            map.get(itr - itr2).add(grid[itr][itr2]);
        }
    }
    for(int itr = 0; itr < grid.length; itr++){
        for(int itr2 = 0; itr2 < grid.length; itr2++){
            grid[itr][itr2] = map.get(itr - itr2).poll();
        }
    }
    return grid;   
    }
}