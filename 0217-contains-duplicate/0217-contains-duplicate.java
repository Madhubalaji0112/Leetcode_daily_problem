class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int i:nums){
            if(set1.contains(i)){
                return true;
            }
            set1.add(i);
        }
        return false;
    }
}