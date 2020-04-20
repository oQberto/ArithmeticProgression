package simpleMath;

import Interface.*;
import java.io.*;

public class ArithmeticProgression implements Implementation {
    private static int testsCount;
    private static int startValue;
    private static int step;
    private static double terms;
    private static int isArithmeticProgression;
    private static int progressionSum;
    private static String input;
    private static String deleted = " ";

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        int[] answers = new int[testsCount];

        for (int j = 0; j < testsCount; j++) {
            input = reader.readLine();
            String[] subStr = input.split(deleted);

            startValue = Integer.parseInt(subStr[0]);
            step = Integer.parseInt(subStr[1]);
            terms = Double.parseDouble(subStr[2]);

            double[] array = new double[(int) terms];
            for (int i = 0; i < terms; i++) {
                isArithmeticProgression = startValue + i * step;
                array[i] = isArithmeticProgression;
            }
            progressionSum = (int) Math.round(((array[0] + array[(int) (terms - 1)]) / 2) * terms);
            answers[j] = progressionSum;
        }

        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
