class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int r = str.length() - 1;
        int l = 0;

        while (l < r) {
            if (!Character.isLetterOrDigit(str.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(str.charAt(r))) {
                r--;
            } else if (Character.isLetterOrDigit(str.charAt(l)) && Character.isLetterOrDigit(str.charAt(r))) {
                if (str.charAt(l) == str.charAt(r)) {
                    l++;
                    r--;
                } else {
                    return false;
                }
            }
            // l++;
            // r--;
        }

        return true;
    }
}