package com.epam.task1.goal9;

/**
 * Class with methods for target9
 * Created by Nikita_Zenchyk on 1/20/2017.
 */
public class Target9 {
    /**
     * Method to add second array in first array between k and k+1
     * @param firstarray double[] first array
     * @param secondarray double[] second array
     * @param k int mark to add
     * @return result array
     * @throws Exception if K is bigger then first array
     */
    public double[] createNewArray(double[] firstarray, double[] secondarray, int k) throws Exception {
        if(k>firstarray.length){
            throw new Exception("K is bigger then first array");
        }
        double[] newarray = new double[firstarray.length + secondarray.length];
        for (int i = 0; i < k; i++) {
            newarray[i] = firstarray[i];
            System.out.println(newarray[i]);
        }
        int j = 0;
        for (int i = k; i < secondarray.length+k; i++) {
            newarray[i] = secondarray[j];
            System.out.println(newarray[i]);
            j++;
        }
        j=k;
        for (int i = k + secondarray.length; i < newarray.length; i++) {
            newarray[i] = firstarray[j];
            System.out.println(newarray[i]);
            j++;
        }
        return newarray;
    }
}
