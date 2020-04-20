package beginnersProblems;

import Interface.*;

import java.io.*;

public class MinimumOfTwo implements Implementation {

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int pairsCount = Integer.parseInt(reader.readLine());

        int[] array = new int[pairsCount];
        int result = 0;

        for (int i = 0; i < pairsCount; i++) {
            String string = reader.readLine();
            String deleted = " ";
            String[] subStr = string.split(deleted);
            int firstNum = Integer.parseInt(subStr[0]);
            int secondNum = Integer.parseInt(subStr[1]);

            if (firstNum < secondNum) {
                array[i] = firstNum;
            } else {
                array[i] = secondNum;
            }
        }
        for (int answers : array) {
            System.out.println(answers);
        }
    }
}
