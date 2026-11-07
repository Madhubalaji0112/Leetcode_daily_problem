// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int res = 0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j]){
//                     res++;
//                 }
//             }
//         }
//         return res;
//     }
// }
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] arr = new int[101];
        for(int i=0;i<nums.length;i++){
            res += arr[nums[i]];
            arr[nums[i]]++;
        }
        return res;
    }
}