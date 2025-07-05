class Solution {
    public String finalString(String s) {
    StringBuilder ans = new StringBuilder();

    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) != 'i')
        ans.append(s.charAt(i));
        else{
            ans.reverse();
        }
    }   

    return ans.toString();
    }
}