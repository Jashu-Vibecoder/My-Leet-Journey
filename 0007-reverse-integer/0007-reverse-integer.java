class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int num = x;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            if (rev > Integer.MAX_VALUE / 10) {
                return 0;
            } else if (rev == Integer.MAX_VALUE / 10 && digit > 7) {
                return 0;
            } else if (rev < Integer.MIN_VALUE / 10) {
                return 0;
            } else if (rev == Integer.MIN_VALUE / 10 && digit < -8) {
                return 0;
            }
            rev = (rev * 10) + digit;
            num = num / 10;

        }

        return rev;
    }
}