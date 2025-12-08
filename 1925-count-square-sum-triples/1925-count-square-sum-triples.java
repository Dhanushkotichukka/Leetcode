class Solution {
    public int countTriples(int n) {
        int c = 0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int sum = i*i+j*j;
                int val =(int) Math.sqrt(sum);
                if(val*val == sum && val<=n ) c+=2;
            }
        }
        return c;
    }
}