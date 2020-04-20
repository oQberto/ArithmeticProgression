package beginnersProblems;

import Interface.*;

import java.io.*;
import java.util.Arrays;

public class SumInLoop implements Implementation {
    private static int numbersCount;
    private static String inputNumbers;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        numbersCount = Integer.parseInt(reader.readLine());
        inputNumbers = reader.readLine();
        int[] inputNumbersInt = Arrays.stream(inputNumbers.split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int value : inputNumbersInt) {
            sum = sum + value;
        }

        System.out.println(sum);
    }
}
