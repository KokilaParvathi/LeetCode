class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        Queue<Integer> q =new LinkedList<>();
        int currgas=0,startindex=0,totalcost=0,totalgas=0;
       for(int i=0;i<gas.length;i++){
        totalcost+=cost[i];
        totalgas+=gas[i];
        currgas += gas[i]-cost[i];
        q.add(gas[i]-cost[i]);
        while(currgas<0 && !q.isEmpty()){
                    currgas-=q.poll();
                    startindex++;
        }
       } 
     return ((totalgas>=totalcost)?startindex:-1);
    }
}