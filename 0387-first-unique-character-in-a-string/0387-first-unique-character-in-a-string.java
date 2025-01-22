class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(!map.containsKey(arr[i])){
                q.add(arr[i]);
            }   
        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>1)
            q.poll();
            else if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;
    }
}
