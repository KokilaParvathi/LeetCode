class Solution {
    public boolean wordPattern(String pattern, String s) {
    char[] arr = pattern.toCharArray();
    String[] str = s.split("\\s+");
    if(arr.length != str.length) return false;
    
    HashMap<Character,String> map = new HashMap<>();
    map.put(arr[0],str[0]);

    for(int itr = 0; itr < arr.length; itr++){
    if(!map.containsKey(arr[itr])){
        if(map.containsValue(str[itr])) return false;
        else map.put(arr[itr],str[itr]);
    }
    else{
     String a = map.get(arr[itr]);
     if(!a.equals(str[itr])) return false;  
    } 
    }

    return true;  
    }
}