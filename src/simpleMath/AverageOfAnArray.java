package simpleMath;

import Interface.*;
import java.io.*;

public class AverageOfAnArray implements Implementation {
    private static int avg;
    private static double arraySum;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testsCount = Integer.parseInt(reader.readLine());

        int[] answers = new int[testsCount];

        for (int i = 0; i < testsCount; i++) {
            String input = reader.readLine();
            String[] subStr = input.split(" ");
            for (String s : subStr) {
                arraySum += Double.parseDouble(s);
                avg = (int) Math.round(arraySum / (subStr.length - 1));
            }
            answers[i] = avg;
            arraySum = 0;
        }

        for (int array : answers) {
            System.out.print(array + " ");
        }
    }
}