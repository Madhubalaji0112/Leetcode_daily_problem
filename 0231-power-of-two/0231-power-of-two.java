class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<Integer.MAX_VALUE;i++){
            if(n == Math.pow(2,i)) return true;
            if(n<Math.pow(2,i)) return false;
        }
        return false;
    }
}