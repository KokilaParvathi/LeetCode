class Solution {
    public int maxAdjacentDistance(int[] arr) {

    int max = Math.abs(arr[0]-arr[arr.length-1]);

    for(int i = 0; i < arr.length-1;i++){
        int val = Math.abs(arr[i] - arr[i+1]);
        max = max < val ? val:max;
    } 

    return max;   
    }
}