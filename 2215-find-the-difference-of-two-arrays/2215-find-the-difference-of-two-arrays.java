// class Solution {
//     public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
//         List<List<Integer>> res = new ArrayList<>();
//         List<Integer> l1 = new ArrayList<>();
//         List<Integer> l2 = new ArrayList<>();
//         // for(int i=0;i<nums1.length;i++){
//         //     for(int j=0;j<nums2.length;j++){
//         //         if(nums1[i] == nums2[j]){
//         //             continue;
//         //         }
//         //         l1.add(nums1[i]);
//         //     }
            
//         // }
//         // for(int i=0;i<nums2.length;i++){
//         //     if(l1.contains(nums1[i])){
//         //         continue;
//         //     }
//         //     l2.add(nums2[i]);
//         // }
//         for(int n:nums1){
//             l1.add(n);
//         }
//         for(int n:nums2){
//             l2.add(n);
//         }
//         for(int i=0;i<l2.size();i++){
//             if(l1.contains(l2.get(i))){
//                 l1.remove(l2.get(i));
//             }
//         }
//         for(int i=0;i<l1.size();i++){
//             if(l2.contains(l1.get(i))){
//                 l2.remove(l1.get(i));
//             }
//         }
//         res.add(l1);
//         res.add(l2);
//         return res;
//     }
// }
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use Sets to automatically handle distinct values
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        
        // Find elements in set1 that are not in set2
        for (int n : set1) {
            if (!set2.contains(n)) {
                l1.add(n);
            }
        }
        
        // Find elements in set2 that are not in set1
        for (int n : set2) {
            if (!set1.contains(n)) {
                l2.add(n);
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        res.add(l1);
        res.add(l2);
        
        return res;
    }
}