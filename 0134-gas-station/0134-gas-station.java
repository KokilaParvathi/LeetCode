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

            queue.add(i); // Store station index as a potential start point

            // If current gas goes negative, reset the queue
            if (currGas < 0) {
                while (!queue.isEmpty()) {
                    queue.poll(); // Remove invalid start points
                }
                currGas = 0; // Reset fuel balance
                startIndex = i + 1; // Move to next station
            }
        }

        return (totalGas >= totalCost) ? (queue.isEmpty() ? startIndex : queue.peek()) : -1;
    }
}
