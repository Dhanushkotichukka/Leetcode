class Solution {
    public int arraySign(int[] nums) {
        int x = 1;
        for(int i: nums){
            if(i==0) return 0;
            if( i<0 ) x =-x; 
        }
        if(x<0) return -1;
        else if(x>0) return 1;
        else return 0;
    }
}