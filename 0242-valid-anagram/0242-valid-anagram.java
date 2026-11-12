class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int[] freq = new int[26];
        if(s.length() != t.length()) return false;
        for(int i=0;i<arr1.length;i++){
            freq[arr1[i]-'a']++;
            freq[arr2[i]-'a']--;
        } 
        
        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}