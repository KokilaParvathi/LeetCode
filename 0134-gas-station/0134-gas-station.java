import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0, currGas = 0, startIndex = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currGas += gas[i] - cost[i];
            queue.add(i); 
            if (currGas < 0) {
                while (!queue.isEmpty()) {
                    queue.poll(); 
                }
                currGas = 0; 
                startIndex = i + 1; 
            }
        }

        return (totalGas >= totalCost) ? (queue.isEmpty() ? startIndex : queue.peek()) : -1;
    }
}
