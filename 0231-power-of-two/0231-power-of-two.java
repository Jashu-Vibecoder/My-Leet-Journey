class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean  ans=false;
        if(n<=0){
            return ans;
        }else if((n & (n-1))==0){
            ans=true;
        }

        return ans;
    }
}