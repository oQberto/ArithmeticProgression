package beginnersProblems;

import Interface.*;

import java.io.*;

public class MinimumOfThree implements Implementation {

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pairCounts = Integer.parseInt(reader.readLine());
        int[] array = new int[pairCounts];

        for (int i = 0; i < pairCounts; i++) {
            String numbers = reader.readLine();
            String deleted = " ";
            String[] subStr = numbers.split(deleted);

            int firstNum = Integer.parseInt(subStr[0]);
            int secondNum = Integer.parseInt(subStr[1]);
            int thirdNum = Integer.parseInt(subStr[2]);

            int min = 0;
            if (min > firstNum) {
                min = firstNum;
                array[i] = min;
            } else if (min > secondNum) {
                min = secondNum;
                array[i] = min;
            } else {
                min = thirdNum;
                array[i] = min;
            }
        }
        for (int answers : array) {
            System.out.println(answers);
        }
    }
}
