class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder s= new StringBuilder();
        int last=strs.length-1;

        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[last].charAt(i)){
                s.append(strs[0].charAt(i));
            }else{
                break;
            }
        }

        
    return s.toString();  
    }
}