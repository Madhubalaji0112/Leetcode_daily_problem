class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Array to store the count of each of the 26 lowercase letters
        int[] letterCounts = new int[26];
        
        // Stock the inventory from the magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            // Subtracting 'a' converts the char to an index 0-25
            // e.g., 'a' - 'a' = 0, 'b' - 'a' = 1, 'z' - 'a' = 25
            letterCounts[c - 'a']++; 
        }
        
        // Try to construct the ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int index = c - 'a';
            
            // If we don't have any of this letter left, we can't build the note
            if (letterCounts[index] == 0) {
                return false;
            }
            
            // Otherwise, "use" one of these letters
            letterCounts[index]--;
        }
        
        return true;
    }
}