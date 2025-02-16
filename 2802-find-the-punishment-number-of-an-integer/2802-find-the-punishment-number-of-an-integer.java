class Solution {
    public int punishmentNumber(int limit) {
    int[] validNumbers = {1,9,10,36,45,55,82,91,99,100,235,297,369,370,379,414,657,675,703,756,792,909,918,945,964,990,991,999,1000};
        int totalSum = 0;

        for (int i = 0; i < validNumbers.length; i++) {
            if (validNumbers[i] <= limit) 
                totalSum += validNumbers[i] * validNumbers[i];
            else 
                break;
        }

        return totalSum;
    }
}
