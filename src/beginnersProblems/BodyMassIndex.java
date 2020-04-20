package beginnersProblems;

import Interface.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BodyMassIndex implements Implementation {
    private static int testsCount;
    private static int weight;
    private static double height;
    private static double bmi;
    private static String humanIndex;

    private static final double UNDER_WEIGHT = 18.5;
    private static final double NORMAL_WEIGHT = 18.5;
    private static final double OVER_WEIGHT = 25.0;
    private static final double OBESITY = 30.0;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        String[] index = new String[testsCount];

        for (int i = 0; i < testsCount; i++) {
            String input = reader.readLine();
            String[] subStr = input.split(" ");

            weight = Integer.parseInt(subStr[0]);
            height = Double.parseDouble(subStr[1]);

            bmi = weight / Math.pow(height, 2);

            if (bmi < UNDER_WEIGHT ) {
                humanIndex = "under";
                index[i] = humanIndex;
            }
            if (bmi >= NORMAL_WEIGHT && bmi < OVER_WEIGHT) {
                humanIndex = "normal";
                index[i] = humanIndex;
            }
            if (bmi > OVER_WEIGHT && bmi < OBESITY) {
                humanIndex = "over";
                index[i] = humanIndex;
            }
            if (bmi > OBESITY) {
                humanIndex = "obese";
                index[i] = humanIndex;
            }
        }
        for (String array : index) {
            System.out.print(array + " ");
        }
    }
}