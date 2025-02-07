class Solution {
    public boolean areNumbersAscending(String s) {
      Queue<Integer> q = new LinkedList<>();
      
      for (String num : s.split(" ")) { 
            if (num.matches("\\d+")) q.add(Integer.parseInt(num));
        }

      int prev=q.poll();
      
      while(!q.isEmpty()){
        int curr = q.poll(); 
        if(prev >= curr) return false;
        prev = curr;
      }
      return true; 
    }
}