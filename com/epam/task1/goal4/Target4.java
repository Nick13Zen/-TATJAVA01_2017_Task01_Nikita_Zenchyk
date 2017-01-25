package com.epam.task1.goal4;

/**
 * Class with methods for target4
 * Created by Nikita_Zenchyk on 1/19/2017.
 */
public class Target4 {
    private double x;
    private double y;

    public Target4(double x, double y) throws Exception {
        this.x = x;
        this.y = y;
        if (Double.isNaN(x) || Double.isNaN(y) || Double.isInfinite(x) || Double.isInfinite(y)) {
            throw new Exception("Invalid input");
        }
    }

    /**
     * Method to check if coordinates are in aria
     *
     * @return boolean true if coordinates are in figure, false if not
     */
    public boolean checkEnteringInFigure() {
        boolean ans = false;
        if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) {
            ans = true;
        } else {
            if ((x >= -4 && x <= 4) && (y >= -4 && y <= 0)) {
                ans = true;
            }
        }
        return ans;
    }
}
