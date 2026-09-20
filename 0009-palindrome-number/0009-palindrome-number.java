class Solution {
    public boolean isPalindrome(int x) {
        int nrm = x;
        int rev = 0;
        if(nrm<0){
            return false;
        }
        while(x>0){
            rev *= 10;
            rev += x%10;
            x /= 10;
        }
        if(nrm == rev){ 
            return true;
        }
        return false;
    }
}