package com.epam.task1.goal7;

import com.epam.task1.goal6.Target6;

/**
 * Class with methods for target7
 * Created by Nikita_Zenchyk on 1/20/2017.
 */
public class Target7 {
    private double startpoint;
    private double endpoint;
    private double step;

    public Target7(double startpoint, double endpoint, double step) throws Exception {
        if (Double.isNaN(startpoint) || Double.isNaN(endpoint) || Double.isNaN(step)
                || Double.isInfinite(startpoint) || Double.isInfinite(endpoint) || Double.isInfinite(step)) {
            throw new Exception("Invalid input");
        }
        this.startpoint = Double.min(startpoint, endpoint);
        this.endpoint = Double.max(startpoint, endpoint);
        this.step = step;
    }

    /**
     * Method to solve the equation
     */
    public void solve() throws Exception {
        System.out.println("Output data");
            for (double i = startpoint; i <= endpoint; i += step) {
                System.out.println(i + " " + (Math.pow(Math.sin(i), 2) - Math.cos(2 * i)));
            }
    }
}