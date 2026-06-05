class Solution {
    private int sol(int num){
        String s = String.valueOf(num);
        int n = s.length();
        if(n<3) return 0;
        int cnt = 0;
        for(int i=1;i<n-1;i++){
            if(s.charAt(i-1) > s.charAt(i) && s.charAt(i+1) > s.charAt(i) 
            || s.charAt(i-1) < s.charAt(i) && s.charAt(i+1) < s.charAt(i) 
            ) cnt++;
        }
        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int res = 0;
        for(int i=num1;i<=num2;i++){
            res += sol(i);
        }
        return res;
    }
}