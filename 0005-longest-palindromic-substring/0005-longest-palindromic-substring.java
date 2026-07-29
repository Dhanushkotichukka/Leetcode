class Solution {
    public String longestPalindrome(String s) {
        int max = 1;
        int str = 0;
        for(int i=0;i<s.length();i++){
            int leftm = palindrome(s,i,i);
            int rightm= palindrome(s,i,i+1);
            int curMax = Math.max(leftm,rightm);
            if(curMax > max){
                max = curMax;
                str = i - (curMax - 1)/2;
            }
        }
        return s.substring(str,str+max);
    }
    public int palindrome(String s,int left , int right){
        while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}