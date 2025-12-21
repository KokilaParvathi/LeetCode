class Solution {
    public int mirrorDistance(int n) {
        int copy = n, rev = 0;

        while (copy != 0) {
            rev = rev * 10 + copy % 10;
            copy /= 10;
        }

        return Math.abs(rev-n);
    }
}