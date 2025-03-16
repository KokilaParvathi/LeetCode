class Solution {
    public String largestNumber(int[] nums) {
        String[] strArr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));

        if (strArr[0].equals("0")) return "0"; 

        return String.join("", strArr);
    }
}
