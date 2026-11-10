class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int s1 = word1.length(); int s2 = word2.length();
        int s = Math.min(s1,s2);
        StringBuilder sb = new StringBuilder(s1+s2);
        for(int i=0;i<s;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(s1>s2){
            sb.append(word1,s,word1.length());
        }else{
            sb.append(word2,s,word2.length());
        }
        return new String(sb);
    }
}