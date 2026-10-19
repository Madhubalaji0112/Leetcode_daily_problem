class Solution {
    public int findNumbers(int[] nums) {
        int totcou = 0;
        for(int i=0;i<nums.length;i++){
            int subcou = 0;
            while(nums[i] >0){
                subcou++;
                nums[i] /= 10;
            }
            if(subcou % 2 == 0) totcou++ ;
        }
        return totcou;
    }
}