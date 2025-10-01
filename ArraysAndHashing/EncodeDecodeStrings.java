package ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;
            decodedStrings.add(s.substring(i, i + length));
            i += length;
        }
        return decodedStrings;
    }

}
