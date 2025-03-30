class Solution {
    public int reverseDegree(String s) {
        char[] arr = s.toCharArray();
        int sum = 0,start_index = 26;
        char a = 'a';

        for(int i = 0; i < arr.length ; i++){
            int rem = arr[i] - a;
            sum += (start_index - rem)*(i+1);
        }

        return sum;
    }
}