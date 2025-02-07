class Solution {
    public boolean checkString(String s) {
      int count=0;
      char[] arr = s.toCharArray();

      for(int index=1; index<arr.length;index++){
        if(arr[index-1] != arr[index])count+=1;
        if(arr[index-1] > arr[index]) count+=1;

        if(count>1) return false;
      }
        return true;
    }
}