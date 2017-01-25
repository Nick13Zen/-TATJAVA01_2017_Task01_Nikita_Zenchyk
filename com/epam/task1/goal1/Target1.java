package com.epam.task1.goal1;

/**
 * Class with method for target 1
 * Created by Nikita_Zenchyk on 1/19/2017.
 */
public class Target1 {
    /**
     * Method to check if first and last chars in num are same
     *
     * @param num input number
     * @return false if first and last chars in num are not same
     */
    public static boolean CheckNum(int num) throws Exception {
        int[] numarray = new int[4];
        if(Integer.toString(num).length() != 4){
            throw new Exception("Number must contain 4 chars");
        }
        for (int i = 0; i < 4; i++) {
            numarray[i] = num % 10;
            num = num / 10;
        }
        if ((numarray[0] + numarray[1]) == (numarray[2] + numarray[3])) {
            return true;
        } else {
            return false;
        }
    }
}
