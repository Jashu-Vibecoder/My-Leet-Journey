class Solution {
    public int addDigits(int num) {
        int n=num;
        if(num<10){
            return num;
        }
        

        // while(d<10){
        //     int sum=0;
        //     int d=num;
        //     sum=sum+(d%10);
        //     d=d/10;
        //     if(d)
        // }
       return (1+((num-1)%9)); 
    }
}