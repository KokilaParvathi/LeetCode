class Solution {
    public boolean isIsomorphic(String s, String t) {
    HashMap<Character,Character> map = new HashMap<>();
    char[] arr1 = s.toCharArray();
    char[] arr2 = t.toCharArray();
    if(arr1.length != arr2.length) return false;

    for(int itr = 0; itr < arr1.length ; itr++){
      if(!map.containsKey(arr1[itr])){
        if(map.containsValue(arr2[itr])) return false;
        else map.put(arr1[itr] , arr2[itr]);
      }
      else{
        if(!map.get(arr1[itr]).equals(arr2[itr])) return false;
      }
    }
    return true;
    }
}