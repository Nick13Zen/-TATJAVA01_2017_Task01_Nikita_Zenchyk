package com.epam.task1.goal6;

/**
 * Class with methods for target6
 * Created by Nikita_Zenchyk on 1/20/2017.
 */
public class Target6 {
    private double[] array = new double[3];

    public Target6(double a, double b, double c) throws Exception {
        if (Double.isNaN(a) || Double.isNaN(b) || Double.isNaN(c)
                || Double.isInfinite(a) || Double.isInfinite(b) || Double.isInfinite(c)) {
            throw new Exception("Invalid input");
        }
        this.array[0] = a;
        this.array[1] = b;
        this.array[2] = c;
    }

    /**
     * Method to find sym of max and min value
     *
     * @return double sym of mix and max values
     */
    public double findMinMaxSym() {
        double sym = 0;
        double minvalue = 0;
        double maxvalue = 0;
        for (int i = 0; i < 3; i++) {
                minvalue = Double.min(minvalue,array[i]);
                maxvalue = Double.max(maxvalue,array[i]);
        }
        if(Double.compare(minvalue, Double.MIN_VALUE)==0 || (Double.compare(maxvalue, Double.MAX_VALUE)==0)){
            System.out.println("Max or Min value equals Double Min or Max value possible data loss");
        }
        sym = minvalue + maxvalue;
        System.out.println(minvalue + " " + maxvalue);
        System.out.println(sym);
        return sym;
    }
}
