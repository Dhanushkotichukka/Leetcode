class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int maxeat = n/2;
        HashSet<Integer> st = new HashSet<>();
        for(int i: candyType){
            st.add(i);
        }
        int s = st.size();
        if(s==maxeat) return s;
        else if(s>maxeat) return maxeat;
        else return s;
    }
}