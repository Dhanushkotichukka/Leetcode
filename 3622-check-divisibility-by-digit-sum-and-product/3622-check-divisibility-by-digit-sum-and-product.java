class Solution {
    public boolean checkDivisibility(int n) {
        int or = n;
        int sum = 0;
        int mul = 1;
        while(or > 0){
            sum += or%10;
            mul *= or%10;
            or /= 10;
        }
        int div = sum+mul;
        return n%div ==0;
    }
}