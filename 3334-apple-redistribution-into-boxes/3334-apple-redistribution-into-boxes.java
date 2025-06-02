class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
    Arrays.sort(capacity);
    
    int sum = 0,sum1 = 0;
    for(int a:apple) sum+=a;

     for (int i = capacity.length - 1, j = 0; i >= 0; i--, j++) {
            sum1 += capacity[i]; 
            if (sum1 >= sum) return j + 1; 
        }

    return capacity.length;
    }
}