package Stack;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int len = position.length;
        double[][] cars = new double[len][2];
        for (int i = 0; i < len; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        int fleet = 1;
        double previousTime = (double)(target-cars[0][0] / cars[0][1]);
        for (int i = 1; i < len; i++) {
            double currentTime = (double)((target-cars[i][0]) / cars[i][1]);
            if (currentTime > previousTime) {
                fleet++;
                previousTime = currentTime;
            }
        }
        return fleet;
    }

}
