class Solution {
    public String clearDigits(String s) {
   for(int itr = 1;itr < s.length(); itr++){
            if(!Character.isLetter(s.charAt(itr)) && Character.isLetter(s.charAt(itr-1))){
                s = clearDigits(s.substring(0,itr-1) + s.substring(itr+1));
            }
        }
        return s;    
    }
}