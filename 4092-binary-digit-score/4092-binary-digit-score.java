class Solution {
    public int calculateScore(int a, int b) {
        int c1=0;
        int c2=0;

        int i=a;
        int j=b;

        while(i>0){
      
            if((i&1)==1){
                c1++;
            }
            i>>=1;
        }
        while(j>0){
  
            if((j&1)==1){
                c2++;
            }
            j>>=1;
        }
        
        
        return (c1 >= c2) ? (c1 * c2) : (c2 / c1);
    }
}