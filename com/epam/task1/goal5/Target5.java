package com.epam.task1.goal5;

import com.epam.task1.goal4.Target4;

/**
 * Class with methods for target5
 * Created by Nikita_Zenchyk on 1/19/2017.
 */
public class Target5 {
    private double[] array = new double[3];
    private double b;

    public Target5(double a, double b, double c) throws Exception {
        this.array[0] = a;
        this.array[1] = b;
        this.array[2] = c;
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)
                || Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)) {
            throw new Exception("Invalid input");
        }
    }

    /**
     * Method to squared not negative values and else raise to the power 4
     */
    public void solve() {
        for (int i = 0; i < 3; i++) {
            if (Double.compare(array[i], 0) == 0 || (Double.compare(array[i], 0) > 0)) {
                array[i] = Math.pow(array[i], 2);
            } else {
                array[i] = Math.pow(array[i], 4);
            }
        }
    }

    public double[] getArray() {
        return array;
    }
}
