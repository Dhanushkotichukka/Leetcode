class Solution {
    List<String> ans = new ArrayList<>();

    void findComb(String digits, int idx, StringBuilder s, List<String> list) {
        if (s.length() == digits.length()) {
            ans.add(s.toString());
            return;
        }
        
        String letters = list.get(digits.charAt(idx) - '2');
        for (int i = 0; i < letters.length(); i++) {
            s.append(letters.charAt(i));

            findComb(digits, idx + 1, s, list);

            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> keys = new ArrayList<>();
        keys.add("abc");
        keys.add("def");
        keys.add("ghi");
        keys.add("jkl");
        keys.add("mno");
        keys.add("pqrs");
        keys.add("tuv");
        keys.add("wxyz");

        findComb(digits, 0, new StringBuilder(), keys);

        return ans;
    }
}