class Solution {
    public String digitSum(String s, int k) {

        if(s.length()<=k){
            return s;
        }        

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            int sum=0;
            for(int j=i;j < Math.min(i + k, s.length());j++ ){
                int digit= s.charAt(j)-'0';
                sum+=digit;
            }
            sb.append(sum);
        }

        String ans = sb.toString();
        if(ans.length()<=k){
            return ans;
        }
        return digitSum(ans,k);
    }
}