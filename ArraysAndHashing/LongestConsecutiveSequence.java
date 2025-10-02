package ArraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int length = nums.length;
        int longest = 0;
        if (length == 0)
            return longest;
        if (length == 1) {
            longest++;
            return longest;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                int prev = map.getOrDefault(num - 1, 0);
                int next = map.getOrDefault(num + 1, 0);
                map.put(num, prev + next + 1);
                int value = map.get(num);
                map.put(num - prev, value);
                map.put(num + next, value);
                longest = Math.max(longest, map.get(num));
            }
        }
        return longest;
    }
}
