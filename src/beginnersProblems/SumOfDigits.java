package beginnersProblems;

import Interface.Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits implements Implementation {
    private static int testsCount;
    private static int intermediateValue;
    private static int finalValue;
    private static String input;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        testsCount = Integer.parseInt(reader.readLine());

        int[] answersArray = new int[testsCount];
        for (int i = 0; i < testsCount; i++) {
            input = reader.readLine();
            String[] startValues = input.split(" ");
            intermediateValue = Integer.parseInt(startValues[0]) * Integer.parseInt(startValues[1]) + Integer.parseInt(startValues[2]);

            String[] subIntermediateValue = String.valueOf(intermediateValue).split("");
            for (int j = 0; j < subIntermediateValue.length; j++) {
                finalValue += Integer.parseInt(subIntermediateValue[j]);
            }
            answersArray[i] = finalValue;
            finalValue = 0;
        }
        for (int array : answersArray) {
            System.out.print(array + " ");
        }
    }
}