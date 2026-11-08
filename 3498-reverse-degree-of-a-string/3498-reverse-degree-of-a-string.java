class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int asc =s.charAt(i);
            res += (27-(asc-96))*(i+1);
        }
        return res;
    }
}