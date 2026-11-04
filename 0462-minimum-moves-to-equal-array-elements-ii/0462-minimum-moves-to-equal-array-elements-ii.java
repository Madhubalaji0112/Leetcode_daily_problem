// class Solution {
//     public int minMoves2(int[] nums) {
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             max = Math.max(max,nums[i]);
//         }
//         int half = 0;
//         if(max%2 == 1){
//             half = max/2 + 1;
//         }else{
//             half = max/2;
//         }
//         int ans =0;
//         for(int i=0;i<nums.length;i++){
//                 ans += Math.abs(nums[i]-half );
//         }
//         return ans;
//     }
// }
import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        // Step 1: Sort to easily find the median
        Arrays.sort(nums);
        
        // Step 2: Find the median element
        int median = nums[nums.length / 2];
        int totalMoves = 0;
        
        // Step 3: Calculate the absolute differences
        for (int num : nums) {
            totalMoves += Math.abs(num - median);
        }
        
        return totalMoves;
    }
}