class Solution {
    public boolean isPowerOfFour(int n) {

        if((n & 0x55555555) != 0){
            return ((long)n & (long)(n - 1)) == 0;
        }

      return false;  
    }
}