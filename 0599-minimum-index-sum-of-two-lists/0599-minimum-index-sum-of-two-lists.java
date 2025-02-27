class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> hml2 = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        int sum = Integer.MAX_VALUE;

        for(int i = 0 ; i < list2.length ; i++){
            hml2.put(list2[i],i);
        }

        for(int j = 0 ; j < list1.length ; j++){
            if(hml2.containsKey(list1[j])){
                int currsum = j + hml2.get(list1[j]);

                if(sum == currsum) al.add(list1[j]);
                else if(sum > currsum){
                    sum = currsum;
                    al.clear();
                    al.add(list1[j]);
                }
            }
        }

        return al.toArray(new String[0]); 
    }
}