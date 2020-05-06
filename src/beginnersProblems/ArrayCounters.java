package beginnersProblems;

import Interface.Implementation;

import java.io.*;
import java.util.Arrays;

public class ArrayCounters implements Implementation {
    String startValues;
    String startArray;

    int arrayRange;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        startValues = reader.readLine();
        startArray = reader.readLine();

        String[] subStartValues = startValues.split(" ");
        arrayRange = Integer.parseInt(subStartValues[1]);

        int[] subStartArray = Arrays.stream(startArray.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] finalArray = new int[arrayRange];

        int count = 0;

        for (int i = 1; i <= arrayRange; i++) {
            for (int intermediateValue : subStartArray) {
                if (intermediateValue == i) {
                    count++;
                    finalArray[i - 1] = count;
                }
            }
            count = 0;
        }
        for (int answer : finalArray) {
            System.out.print(answer + " ");
        }
    }
}
