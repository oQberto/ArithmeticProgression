package beginnersProblems;

import Interface.Implementation;

import java.io.*;
import java.util.Arrays;

public class CollatzSequence implements Implementation {
    int numberOfDigitsInInputLine;
    int count = 0;

    String inputLine;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numberOfDigitsInInputLine = Integer.parseInt(reader.readLine());
        inputLine = reader.readLine();

        int[] arrayOfInputNumbers = Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] outputArray = new int[numberOfDigitsInInputLine];

        for (int i = 0; i < arrayOfInputNumbers.length; i++) {
            computingOverArrayNumbers(arrayOfInputNumbers[i]);
            outputArray[i] = count;
            count = 0;
        }

        for (int answer : outputArray) {
            System.out.print(answer + " ");
        }
    }

    private void computingOverArrayNumbers(int inputNumber) {
        while (inputNumber != 1) {
            if (inputNumber % 2 == 0) {
                inputNumber = inputNumber / 2;
            } else {
                inputNumber = inputNumber * 3 + 1;
            }
            count++;
        }
    }
}
