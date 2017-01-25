package com.epam.task1.goal2;

/**
 * Class with method for target 2
 * Created by Nikita_Zenchyk on 1/19/2017.
 */
public class Target2 {
    /**
     * Method to reslove arithmetic expression
     *
     * @param a input var
     * @param b input var
     * @param c input var
     * @return result of arithmetic expression
     */
    public static double resolve(double a, double b, double c) throws Exception {
        double sqrtans = (Math.pow(b, 2)) + 4 * a * c;
        double ans = 0;
        if (a != 0 && b != 0) {
            if (sqrtans > 0) {
                sqrtans = Math.sqrt(sqrtans);
            }
            if (sqrtans < 0) {
                throw new Exception("var in sqrt is < 0");
            }
            ans = ((b + sqrtans) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        } else {
            throw new ArithmeticException("Vars A and B can't be 0");
        }
        return ans;
    }
}
