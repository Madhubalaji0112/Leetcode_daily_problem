class Solution {
    public int maxProfit(int[] prices) {
        int minele = Integer.MAX_VALUE;
        int maxpro = 0;
        for(int i=0;i<prices.length;i++){
            minele = Math.min(minele,prices[i]);
            int pro = prices[i] - minele ;
            maxpro = Math.max(pro,maxpro);
        }
        return maxpro;
    }
}