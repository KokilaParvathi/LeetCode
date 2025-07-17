class Solution {
    public int countSubarrays(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length && i+2 < arr.length; i++){
            int sum = arr[i]+arr[i+2];
            if(sum+sum == arr[i+1]) count++;
        }
        
        return count;
    }
}