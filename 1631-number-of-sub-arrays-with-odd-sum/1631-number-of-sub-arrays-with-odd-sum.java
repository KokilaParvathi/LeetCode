class Solution {
    public int numOfSubarrays(int[] arr) {
        int result = 0;
        int evenCount = 1;
        int oddCount = 0;
        int prefSum = 0;
        
        for(int i = 0; i < arr.length; i++){
            prefSum += arr[i];

            if(prefSum % 2 == 0){
                result = (result + oddCount) % 1000000007;
                evenCount++;
            }
            else{
                result = (result + evenCount) % 1000000007;
                oddCount++;
            }
        }
        return result;
    }
}