class Solution {
    public int trailingZeroes(int n) {
        // int fact = 1;
        // for(int i=1;i<=n;i++){
        //     int *= i;
        // }
        // int count = 0;
        // String s = Long.toString(fact);
        // for(int i =s.length()-1;i>=0;i--){
        //     if(s.charAt(i) == '0') count++;
        //     else break ;
        // }
        int count =0;
        while(n>0){
            n /= 5;
             count += n;
        }
        return count;
    }
}