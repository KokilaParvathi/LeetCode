class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map = new HashMap<>();
    char[] arr = pattern.toCharArray();
    String[] str = s.split("\\s+");
    if(arr.length != str.length) return false;
    
    for(int itr = 0; itr < arr.length; itr++){
    if(!map.containsKey(arr[itr])){
        if(map.containsValue(str[itr])) return false;
        else map.put(arr[itr],str[itr]);
    }
    else if(!(map.get(arr[itr]).equals(str[itr]))) return false;  

    }
    return true;  
    }
}