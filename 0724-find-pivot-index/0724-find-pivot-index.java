class Solution {
    public int pivotIndex(int[] nums) {
        
        for(int pv=0;pv<nums.length;pv++){
            int lsum = 0;
            int rsum = 0;
            for(int i=0;i<pv;i++){
                lsum += nums[i];
            }
            for(int i=pv+1;i<nums.length;i++){
                rsum += nums[i];
            }
            if(lsum == rsum ){
                return pv;
            }
        }
        return -1;
    }
}