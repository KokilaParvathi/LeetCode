class Solution {
    public int product(int n){
        int sum = 1;
        while(n > 0){
            sum*=(n%10);
            n/=10;
        }
        return sum;
    }

    public int add(int n){
        int sum = 0;
        while(n > 0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }

    public int subtractProductAndSum(int n) {
    int productsum = product(n);
    int digitsum = add(n);

    return productsum - digitsum; 
    }
}