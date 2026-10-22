class Solution {
    public int strStr(String haystack, String needle) {
        int len=needle.length();
        int hlen=haystack.length();
        if(len==0){
            return 0;
        }
        if(hlen==len){
            if(haystack.equals(needle)){
                return 0;
            }else{
                return -1;
            }
        }

        for(int i=0;i<hlen-len+1;i++){
           if((haystack.substring(i,i+len).equals(needle))){
            return i;
           }
        }



    return -1;
    }
}