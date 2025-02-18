class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for(int num: nums1){
            hs.add(num);
        }
        for(int num: nums2){
            hs1.add(num);
        }

        hs.retainAll(hs1);  

        int[] arr = new int[hs.size()];
        int i = 0;
        for (int num : hs) {
            arr[i++] = num;
        }

    return arr;
    }
}