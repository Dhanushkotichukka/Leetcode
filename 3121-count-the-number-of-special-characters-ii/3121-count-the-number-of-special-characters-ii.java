class Solution {
    public int numberOfSpecialChars(String word) {
        int lstLower[] = new int[26];
        int lstUpper[] = new int[26];
        Arrays.fill(lstLower,-1);
        Arrays.fill(lstUpper,-1);
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if( ch >= 'a' && ch <= 'z'){
                lstLower[ch-'a'] = i;
            }else if(lstUpper[ch - 'A'] == -1 ){
                lstUpper[ch-'A'] = i;
            }
        }
        int count = 0;
        for(int i=0;i<26;i++){
            if(lstLower[i] != -1 && lstUpper[i] != -1 && lstLower[i] < lstUpper[i]){
                count++;
            }
        }
        return count;
     }
}