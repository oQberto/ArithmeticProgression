package beginnersProblems;

import Interface.Implementation;

import java.io.*;
import java.util.Arrays;

public class CollatzSequence implements Implementation {
    int numberOfDigitsInInputLine;

    String inputLine;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numberOfDigitsInInputLine = Integer.parseInt(reader.readLine());
        inputLine = reader.readLine();

        int[] arrayOfInputNumbers = Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] outputArray = new int[numberOfDigitsInInputLine];

        int count = 0;
        for (int i = 0; i < arrayOfInputNumbers.length; i++) {
            int intermediateValue = arrayOfInputNumbers[i];

            while (intermediateValue != 1) {
                if (intermediateValue % 2 == 0) {
                    intermediateValue = intermediateValue / 2;
                } else {
                    intermediateValue = intermediateValue * 3 + 1;
                }
                count++;
            }
            outputArray[i] = count;
            count = 0;
        }

        for (int answer : outputArray) {
            System.out.print(answer + " ");
        }
    }
}
