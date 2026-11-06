class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int m=0;
        for(int i=0;i<2*n;i += 2){
            arr[i] = nums[m];
            m++;
        }
        int b = n;
        for(int i=1;i<2*n;i += 2){
            arr[i] = nums[b];
            b++;
        }
        return arr;
        
    }
}