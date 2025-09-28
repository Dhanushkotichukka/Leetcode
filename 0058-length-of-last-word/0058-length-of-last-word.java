class Solution {
    public int lengthOfLastWord(String s) {
        int i,c=0,k=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ') c=0;
            else 
            {
                c++;
                k=c;
            }
        }
        return k;
    }
}