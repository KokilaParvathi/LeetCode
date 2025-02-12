class Solution {
    public int sumd(int num){
    int sum = 0 ;

    while(num > 0){
        sum += (num % 10);
        num /= 10;
    }

    return sum <= 9?sum:sumd(sum);
    }

    public int addDigits(int num) {
    if(num <= 9) return num;
    return sumd(num);  
    }
}