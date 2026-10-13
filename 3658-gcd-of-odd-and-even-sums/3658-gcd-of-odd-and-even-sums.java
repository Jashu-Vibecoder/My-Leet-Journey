class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=0;
        int osum=0;

        for(int i=0;i<=(n+n);i++){
            if(i%2==0){
                esum+=i;
            }else{
                osum+=i;
            }
        }
        int a = Math.max(esum,osum);
        int b = Math.min(esum,osum);

         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}