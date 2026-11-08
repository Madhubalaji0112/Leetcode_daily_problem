class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r = s.length-1;
        while(l<=r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
// class Solution {
//     public void reverseString(char[] s) {
//         int r = s.length-1;
//         for(int i=0;i<s.length;i++){
//             if(i == r || i == r+1) return ;
//             char temp = s[i];
//             s[i] = s[r];
//             s[r] = temp;
//             r--;
//         }
//     }
// }