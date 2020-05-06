/*
https://www.codeabbey.com/index/task_view/array-counters--ru
 */
package beginnersProblems;

import Interface.Implementation;

import java.io.*;
import java.util.Arrays;

public class ArrayCounters implements Implementation {
    private String startValues;
    private String startArray;

    private int arrayRange;
    private int[] finalArray;
    private int[] subStartArray;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        startValues = reader.readLine();
        startArray = reader.readLine();

        String[] subStartValues = startValues.split(" ");
        arrayRange = Integer.parseInt(subStartValues[1]);

        subStartArray = Arrays.stream(startArray.split(" ")).mapToInt(Integer::parseInt).toArray();
        finalArray = new int[arrayRange];

        countingNumberInAnArray();
        printAnswer();
    }

    private void countingNumberInAnArray() {
        for (int value : subStartArray) {
            finalArray[value - 1]++;
        }
    }

    private void printAnswer() {
        for (int answer : finalArray) {
            System.out.print(answer + " ");
        }
    }
}