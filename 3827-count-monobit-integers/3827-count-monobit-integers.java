class Solution {
    public int countMonobit(int n) {
        int c = 0;
        for(int i=0;i<=n;i++){
            String s = Integer.toBinaryString(i);
            int f = 0;
            for(int j=0;j<s.length()-1;j++){
                if(s.charAt(j)!=s.charAt(j+1)){
                    f = 1;
                    break;
                }
            }
            if(f==0)c++;
        }
        return c;
    }
}