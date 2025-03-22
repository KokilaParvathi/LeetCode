class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();

        if(arr.length != arr1.length) return false;

        for(int index = 0; index < arr.length; index++){
            if(!hm.containsKey(arr[index])){
                if(hm.containsValue(arr1[index])) return false;
                else hm.put(arr[index],arr1[index]);
            }
            else if(hm.get(arr[index]) != arr1[index]) return false;
            
        }

        return true;
    }
}