// https://leetcode.com/problems/find-the-highest-altitude/

import java.util.*;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5, 4, 1, 5, 0, -7};
        int result = largestAltitude(gain);
        System.out.println(result);
    }
    public static int largestAltitude(int[] gain) {
        // int start = 0;
        // for (int i = 0; i < gain.length; i++) {
        //     if (gain[i] > 0) return gain[i];
        // }
        // return start;
        int altitude = 0;
        int maxAltitude = 0;
        for (int g : gain) {
            altitude += g;
            maxAltitude = Math.max( maxAltitude, altitude );
        }
        return maxAltitude;
    }
}
