class Solution {
    public boolean judgeCircle(String moves) {
        int v = 0;
        int h = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U') v+=1;
            if(ch == 'D') v-=1;
            if(ch == 'L') h+=1;
            if(ch == 'R') h-=1;
        }
        if(v==0 && h==0) return true;
        else          return false;
    }
}