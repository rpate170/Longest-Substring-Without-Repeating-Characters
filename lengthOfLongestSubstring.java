class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int total = 0;
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < len; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            total = Math.max(total, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return total;
    }
}