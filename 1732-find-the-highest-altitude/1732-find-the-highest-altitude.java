class Solution {
    public int largestAltitude(int[] gain) {
        int cursum = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            cursum += gain[i];
            max = Math.max(max,cursum);
        }
        // if(max<0){
        //     return 0;
        // }
        return max;
    }
}