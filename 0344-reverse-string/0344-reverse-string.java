class Solution {
    public void reverseString(char[] s) {
        solve(s,0,s.length-1);
    }
    public static void solve(char s[],int start,int end){
        if(end <= start) return;
        char temp = s[start];
        s[start] = s[end];
        s[end]  = temp;
        solve(s,start+1,end-1);
    }
}