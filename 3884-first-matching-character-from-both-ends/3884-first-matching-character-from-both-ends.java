class Solution {
    public int firstMatchingIndex(String s) {
        int r = s.length()-1;
        if(s.length() == 1) return 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(r-i)) return i;
        }
        return -1;
    }
}