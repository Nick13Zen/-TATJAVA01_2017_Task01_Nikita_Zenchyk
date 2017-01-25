package com.epam.task1.goal8;

/**
 * Class with methods for target8
 * Created by Nikita_Zenchyk on 1/20/2017.
 */
public class Target8 {
    /**
     * Method to find sym of all values multiple to k
     *
     * @param array int[] of values
     * @param k     int multiple
     * @return int sym of all values multiple to k
     */
    public int solve(int[] array, int k) {
        int sym = 0;
        for (int val : array) {
            if (val % k == 0) {
                sym += val;
            }
        }
        return sym;
    }
}
