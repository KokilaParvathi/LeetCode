class Solution {
    public int countKeyChanges(String s) {
    int count = 0;
    char[] arr = s.toCharArray();

    for(int i = 1; i < arr.length; i++){
        char a1 = Character.toLowerCase(arr[i - 1]);
        char a2 = Character.toLowerCase(arr[i]);
        if(a1 != a2) count++;
    } 

    return count;  
    }
}