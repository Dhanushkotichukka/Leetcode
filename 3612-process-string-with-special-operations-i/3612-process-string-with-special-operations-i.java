class Solution {
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '*' && sb.length() > 0) sb.deleteCharAt(sb.length()-1);
            else if(ch == '#') sb.append(sb.toString());
            else if(ch >= 'a' && ch <= 'z')  sb.append(ch);
            else sb.reverse();
            
        }
        return sb.toString();
    }
}