package com.epam.task1.goal10;

/**
 * Class with methods for target10
 * Created by Nikita_Zenchyk on 1/20/2017.
 */
public class Target10 {
    /**
     * Method to create array
     * @param n arrays dimension
     * @return new array
     * @throws Exception
     */
    public int[][] createArray(int n) throws Exception {
        int[][] newarray = new int[n][n];
        if (n % 2 != 0) {
            throw new Exception("N is not even");
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    newarray[i][j] = n - j;
                    System.out.print(" " + newarray[i][j]);
                }
            } else {
                for (int j = 0; j < n; j++) {
                    newarray[i][j] = j + 1;
                    System.out.print(" " + newarray[i][j]);
                }
            }
            System.out.println();
        }
        return newarray;
    }
}
