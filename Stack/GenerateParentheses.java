package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    
    public List<String> generateParenthesis(int n) {
        List<List<String>> dp = new ArrayList<>();
        dp.add(List.of(""));
        for (int i = 1; i <= n; i++) {
            List<String> current = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                for (String first : dp.get(j)) {
                    for (String second : dp.get(i - 1 - j)) {
                        current.add("(" + first + ")" + second);
                    }
                }
            }
            dp.add(current);
        }
        return dp.get(n);
    }
}
