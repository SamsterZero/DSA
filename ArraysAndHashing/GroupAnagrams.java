package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<String, List<String>>();
        for(String str : strs){
            int[] alphabets = new int[26];
            for(char c : str.toCharArray()){
                alphabets[c-'a']++;
            }
            String key = Arrays.toString(alphabets);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}