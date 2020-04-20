package beginnersProblems;

import Interface.*;

import java.io.*;

public class Rounding implements Implementation {
    private static int pairDivision;
    private static double firstNum;
    private static double secondNum;
    private static double result;

    @Override
    public void decision() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        pairDivision = Integer.parseInt(reader.readLine());

        int[] array = new int[pairDivision];

        result = 0;
        for (int i = 0; i < pairDivision; i++) {
            String divisionNum = reader.readLine();
            String[] subStr = divisionNum.split(" ");

            firstNum = Integer.parseInt(subStr[0]);
            secondNum = Integer.parseInt(subStr[1]);

            result = firstNum / secondNum;
            result = Math.round(result);
            array[i] = (int) result;
        }
        for (int answers : array) {
            System.out.println(answers);
        }
    }
}
