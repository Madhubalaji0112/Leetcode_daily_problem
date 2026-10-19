class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , subcou = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                subcou++;
            }else{
                subcou = 0;
            }
            count = Math.max(count,subcou);
        }
        return count;
    }
}