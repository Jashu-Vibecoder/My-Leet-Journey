class Solution {
    public boolean isUgly(int n) {

        if(n<=0){return false;}
        int d = n;

        while (d > 1 ) {

            if (d % 2 == 0 ) {
                d = d / 2;
            } else if (d % 3 == 0) {
                d = d / 3;
            } else if (d % 5 == 0) {
                d = d / 5;
            }else{
                return false;
            }
        }
        return true;
    }
}