// class Solution {
//     public boolean judgeCircle(String moves) {
//         int m = 0;int n=0;
//         for(int i=0;i<moves.length();i++){
//             if(c == 'U'){ 
//                 m++; 
//             }else if(c == 'L'){
//                 n--;
//             }else if(c == 'R'){
//                 n++;
//             }else{
//                 m--;
//             }

//         }
        
//         return m == 0 && n == 0;
//     }
// }

class Solution {
    public boolean judgeCircle(String moves) {
        int m = 0;int n=0;
        for(int i=0;i<moves.length();i++){
            char c= moves.charAt(i);
            if(c == 'U') m++;
            else if(c == 'L') n--;
            else if(c == 'R') n++;
            else m--;
        }
        return m == 0 && n == 0;
    }
}