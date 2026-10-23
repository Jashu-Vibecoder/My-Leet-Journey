class Solution {
    public char findTheDifference(String s, String t) {
        int sm=s.length();
        int b=t.length();

        int xor=0;

        for(int i=0;i<sm;i++){
            xor=xor^s.charAt(i);
        }  
        for(int i=0;i<b;i++){
            xor^=t.charAt(i);
        } 

        return (char)xor;   
    }
}