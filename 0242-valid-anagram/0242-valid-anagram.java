class Solution {
    public boolean isAnagram(String s, String t) {
      char[] fc=s.toCharArray();
      char[] sc=t.toCharArray();
      Arrays.sort(fc);
      Arrays.sort(sc);
      String s1=new String(fc);
      String s2=new String(sc);
      if(s1.equals(s2)) 
        return true;
      else 
        return false;

    }
}