package beginnersProblems;
import Interface.*;

import java.io.*;
import java.util.Arrays;

public class MaximumOfArray implements Implementation {

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String strArray = reader.readLine();
        String[] subStr = strArray.split(" ");

        int[] array = new int[300];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(subStr[i]);
        }

        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
