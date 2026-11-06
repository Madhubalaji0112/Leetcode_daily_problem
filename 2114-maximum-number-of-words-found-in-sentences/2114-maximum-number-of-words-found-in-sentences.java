class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            int count=1;
            for(char c:sentences[i].toCharArray()){
                if(c == ' '){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }
}