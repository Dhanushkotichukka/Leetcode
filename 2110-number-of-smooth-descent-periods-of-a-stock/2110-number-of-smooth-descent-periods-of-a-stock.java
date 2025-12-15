class Solution {
    public long getDescentPeriods(int[] prices) {
        long c = 1;
        int k = 1;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]-prices[i+1] == 1){
                k++;
            }else{
                k = 1;
            }
            c+=k;
        }
        return c;
    }
}