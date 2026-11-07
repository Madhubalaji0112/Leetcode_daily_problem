class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>(candies.length);
        int max = Integer.MIN_VALUE;
        for(int n : candies){
            max = Math.max(n,max);
        }
        for(int i =0;i<candies.length;i++){
            // if((candies[i] + extraCandies) >= max){
            //     arr.add(true);
            // }else{
            //     arr.add(false);
            // }
            arr.add(candies[i]+extraCandies >= max);
        }
        return arr;
    }
}