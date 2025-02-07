class Solution {
    public boolean areNumbersAscending(String s) {
      int prev = Integer.MIN_VALUE;
      
      for (String num : s.split(" ")) { 
            if (num.matches("\\d+")){
                int curr = Integer.parseInt(num);
                if(prev>=curr) return false;
                prev = curr;
            } 
        }
      return true; 
    }
}