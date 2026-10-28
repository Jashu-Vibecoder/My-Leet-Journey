class Solution {
    public boolean judgeCircle(String moves) {
        /*
        u->(i-1,j)
        d->(i+1,j)
        l->(i,j+1)
        r->(i,j-1)
         */
        int i = 0;
        int j = 0;
        for (int x = 0; x < moves.length(); x++) {
            if (moves.charAt(x) == 'U') {
                i = i - 1;
            } else if (moves.charAt(x) == 'D') {
                i = i + 1;
            } else if (moves.charAt(x) == 'L') {
                j = j - 1;
            } else if (moves.charAt(x) == 'R') {
                j = j + 1;
            }
        }

        return (i == 0 && j == 0) ? true : false;
    }
}