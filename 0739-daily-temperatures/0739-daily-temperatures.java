class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && t[i] > t[stack.peek()]) {
                int index = stack.pop();
                arr[index] = i - index;
            }
            stack.push(i);
        }
        
        return arr;
    }
}
