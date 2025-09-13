class Solution {
    private boolean isVowel(char ch) {
        char c = Character.toLowerCase(ch);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public int maxFreqSum(String s) {
        int vMax = 0;
        int cMax = 0;
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> cons = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowel.put(ch, vowel.getOrDefault(ch, 0) + 1);
                if(vMax < vowel.get(ch)) vMax = vowel.get(ch);
                
            } else {
                cons.put(ch, cons.getOrDefault(ch,0) + 1);
                if(cMax < cons.get(ch)) cMax = cons.get(ch);
            }
        }
        return vMax+cMax;
    }
}