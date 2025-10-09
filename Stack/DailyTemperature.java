package Stack;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];

        for (int today = len - 2; today >= 0; today--) {
            int days = today + 1;
            while(days < len && temperatures[days] <= temperatures[today]) {
                if(result[days] == 0) {
                    days = len;
                } else {
                    days += result[days];
                }
            }
            
            result[today] = (days < len) ? days - today : 0;
        }
        return result;
    }
}