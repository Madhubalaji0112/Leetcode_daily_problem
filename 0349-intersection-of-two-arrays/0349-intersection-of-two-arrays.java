class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        
        Set<Integer> set = new HashSet<>(n1+n2);
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
        
        int[] arr = new int[set.size()];
        int i=0;
        for(int s : set){
            arr[i] = s;
            i++;
        }
        return arr;
    }
}