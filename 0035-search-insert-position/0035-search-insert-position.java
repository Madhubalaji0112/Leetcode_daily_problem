class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int mid=0;
        if(nums[0]>target){
            return 0;
        }
        while(low<=high){
            mid =(low+high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<target && nums[i+1]>target){
                return i+1;
            }
        }
        return nums.length;
        
    }
}