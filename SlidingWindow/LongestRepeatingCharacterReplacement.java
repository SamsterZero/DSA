package SlidingWindow;

import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new java.util.HashMap<>();
        int res =0;
        int left = 0;
        int maxCount = 0;
        for (int right = 0; right < s.length(); right++) {
            count.put(s.charAt(right),count.getOrDefault(s.charAt(right), 0)+1);
            maxCount = Math.max(maxCount, count.get(s.charAt(right)));
            while (right - left + 1 - maxCount > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
