class Solution {
    public int maxDepth(String s) {
        int d=0;
        int md=0;

        for(int i=0;i<s.length();i++ ){
            if(s.charAt(i)=='('){
                d++;
            }else if(s.charAt(i)==')'){
                d--;
            }else{
                continue;
            }
            md=Math.max(d,md);
        }

        return md;
    }
}