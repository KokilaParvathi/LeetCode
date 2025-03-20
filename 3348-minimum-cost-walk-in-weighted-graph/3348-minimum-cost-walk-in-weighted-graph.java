class Solution {
    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        int[] par = new int[n];
        int[] minD = new int[n];
        for(int i = 0; i < n; i++){
            par[i] = i;
            minD[i] = Integer.MAX_VALUE;
        }
        for(int[] edge : edges){
            int pa = find(par, edge[0]);
            int pb = find(par, edge[1]);
            int val = minD[pa] & minD[pb] & edge[2];
            par[pb] = pa;
            minD[pa] = val;
        }
        int[] res = new int[query.length];
        for(int i = 0; i < query.length; i++){
            int pa = find(par, query[i][0]);
            int pb = find(par, query[i][1]);
            if(pa != pb){
                res[i] = -1;
            }else{
                res[i] = minD[pa];
            }
        }
        return res;
    }

    public int find(int[] par, int idx){
        if(par[idx] == idx){
            return idx;
        }
        return par[idx] = find(par, par[idx]);
    }
}