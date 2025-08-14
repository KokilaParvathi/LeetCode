class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        for(int i = 0; i+2 < num.length(); i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                String triplet = num.substring(i, i + 3);
                if(triplet.compareTo(ans) > 0)
                    ans = triplet;
            }
        }
        
        return ans;

    }
}