class Solution {
    public int smallestEvenMultiple(int n) {
    int i = n;
    while((i % n == 0) != (i % 2 == 0)){
        i+=n;
    }    

    return i;
    }
}