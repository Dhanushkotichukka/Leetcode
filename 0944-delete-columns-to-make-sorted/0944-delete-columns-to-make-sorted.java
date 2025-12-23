class Solution {
    public int minDeletionSize(String[] strs) {
        int c = 0;
        int rows = strs.length;
        int cols = strs[0].length();
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows-1;j++){
                if(strs[j].charAt(i) > strs[j+1].charAt(i)){
                    c+=1;
                    break;
                }
            }
        }
        return c;
    }
}