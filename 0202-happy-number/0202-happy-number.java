class Solution {
    public boolean isHappy(int n) {
        //2, 3, 4, 5, 6, 8, 9
        if (n == 0 || n == 2 || n == 3 || n==4 ||
                n == 5 || n == 6 || n == 9) {
            return false;
        } 
        if (n == 1) {
            return true;
        }
        int sum = 0;
        while (n > 0) {
            int d = n;
            sum += Math.pow((d % 10), 2);
            n = n / 10;
        }

        return isHappy(sum);

    }
}