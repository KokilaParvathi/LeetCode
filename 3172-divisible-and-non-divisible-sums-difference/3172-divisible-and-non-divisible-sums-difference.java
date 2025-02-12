class Solution {
    public int differenceOfSums(int n, int m) {
    int divisible = 0, notdivisible = 0;

    for(int num = 0; num <= n; num++){
        if(num % m == 0) divisible += num;
        else notdivisible += num;
    } 

    return notdivisible - divisible;
    }
}