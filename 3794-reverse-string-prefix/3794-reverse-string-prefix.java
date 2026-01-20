class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder st = new StringBuilder(s.substring(0,k));
        st.reverse();
        st.append(s.substring(k));
        return st.toString();
    }
}