class Solution {
    public int countOdds(int low, int high) {
        if(low%2==0 && high%2==0) return (int)(high-low)/2;
        else                      return (int) 1+(high-low)/2;
    }
}