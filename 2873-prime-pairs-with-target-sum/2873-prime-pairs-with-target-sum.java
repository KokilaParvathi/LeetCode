class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        HashSet<Integer> hs = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean[] arr = new boolean[n];

        for(int i = 2; i < n ;i++){
            arr[i] = true;
        }

        for(int i = 2 ; i*i < n ;i++){
            if(arr[i]){
                for(int j = i*i; j < n ;j+=i){
                    arr[j]=false;
                }
            }
        }

        
        for(int i = 2; i <= n/2 ;i++){
            int target = n - i;
            List<Integer> res = new ArrayList<>();

            if(arr[target] && arr[i]){
                res.add(i);
                res.add(target);

                list.add(res);
            }
        }

        return list;
    }
}