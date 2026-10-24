class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int r=0;
        int q=x;
        while(q!=0){ 
           r=(r*10)+(q%10);
           q = q / 10;
        }
        return x==r;
    }
    
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          