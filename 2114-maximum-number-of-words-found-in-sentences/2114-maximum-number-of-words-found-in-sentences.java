// class Solution {
//     public int mostWordsFound(String[] sentences) {
//         int max=0;
//         for(int i=0;i<sentences.length;i++){
//             int count=1;
//             for(char c:sentences[i].toCharArray()){
//                 if(c == ' '){
//                     count++;
//                 }
//             }
//             max = Math.max(max,count);
//         }
//         return max;
//     }
// }
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for (String sentence : sentences) {
            int count = 1;
            int len = sentence.length();
            
            // Loop through the string directly without creating new arrays
            for (int i = 0; i < len; i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
            
            // Math.max is slightly slower than a simple if-statement
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}