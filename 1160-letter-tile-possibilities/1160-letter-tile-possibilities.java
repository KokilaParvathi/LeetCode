class Solution {
    HashSet<String> set=new HashSet<>();
    public void generate_string_comb(boolean[] vis, int len, String comb, String tiles){
        if(len<=tiles.length() && !comb.equals("")){
            set.add(comb);
        }
        if(len==tiles.length()) return;
        for(int i=0;i<tiles.length();i++){
            if(!vis[i]){
                vis[i]=true;
                generate_string_comb(vis, len+1, comb+tiles.charAt(i), tiles);
                vis[i]=false;
            }
        }
    }
    public int numTilePossibilities(String tiles) {
        int n=tiles.length();
        boolean[] vis=new boolean[n];
        generate_string_comb(vis, 0, "", tiles);
        return set.size();
    }
}