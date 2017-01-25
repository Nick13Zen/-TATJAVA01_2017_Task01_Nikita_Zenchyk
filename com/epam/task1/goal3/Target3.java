package com.epam.task1.goal3;

/**
 * Class with methods for Target3
 * Created by Nikita_Zenchyk on 1/19/2017.
 */
public class Target3 {
    private double a;
    private double b;

    public Target3(double a, double b) throws Exception {
        this.a = a;
        this.b = b;
        if (a < 0 || b < 0 || !Double.isInfinite(a) || !Double.isInfinite(b) || !Double.isNaN(a) || !Double.isNaN(b)) {
            throw new Exception("Invalid input");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    /**
     * Method for resolving arae of triangular
     *
     * @return ans output triangular arae
     */
    public double resolveArae() throws Exception {
        double ans = 0;
        ans = a * b / 2;
        return ans;
    }

    /**
     * Method for resolving perimete of triangular
     *
     * @return ans output triangular perimete
     */
    public double resolvePerimeter() throws Exception {
        double ans = 0;
        ans = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(a, 2));
        return ans;
    }
}