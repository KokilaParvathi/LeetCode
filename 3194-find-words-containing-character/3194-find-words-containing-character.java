class Solution {
    public boolean checkthere(String str,char x){
        char[] arr = str.toCharArray();
        int left = 0,right = arr.length-1;

        while(left <= right){
        if(arr[left] == x || arr[right] == x) return true;
        left++;
        right--;
        } 
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
    List<Integer> result = new ArrayList<>();
    int i=0;
     for(String s: words){
        if(checkthere(s,x)) result.add(i);
        i++;
     }

     return result;   
    }
}