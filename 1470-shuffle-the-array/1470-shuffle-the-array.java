class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int m=0;
        int b = n;
        for(int i=0;i<2*n;i += 2){
            arr[i] = nums[m];
            arr[i+1] = nums[b];
            m++;
            b++;
        }
        return arr;
        
    }
}