class Solution {
    public int smallestRepunitDivByK(int k) {

        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        int count = 0;
        int r = 0;

        do {

            r = ((r * 10) + 1) % k;
            count++;
            if (r == 0) {
                return count;
            }

        } while (r != 0);

        return -1;
    }
}